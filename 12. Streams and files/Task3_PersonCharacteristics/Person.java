package Task4_PersonCharacteristics;

import Education.Education;
import Education.GradedEducation;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Person {

    private String _lastName;
    private String _firstName;
    private String _middleName;
    private char _gender;
    private int _yearsOld;
    private double _height;
    private LocalDate _dateOfBirth;
    private String _genderSex;
    private Education _higherEducation;
    private List<Address> _adress;
    private List<Education> _education;
    private Address _currentAddress;
    private static DateTimeFormatter _formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    private static LocalDate firstBirth = LocalDate.parse("1.1.1900", _formatter);

    public Person(String firstName, String lastName, String middleName, char gender, LocalDate dateOfBirth, double height,
            Address address, Education secondaryEducation) {
        this._firstName = firstName;
        this._middleName = middleName;
        this._lastName = lastName;
        this._gender = gender;
        this._height = height;
        this._dateOfBirth = dateOfBirth;
        this.adress = address;
        this._higherEducation = secondaryEducation;
        _yearsOld = LocalDate.now().getYear() - dateOfBirth.getYear();
        gender();
    }

    public static void verification(String firstName, String middleName, String lastName, char gender, LocalDate dateOfBirth, double height,
            Address address, Education secondaryEducation) {
        if (dateOfBirth.isBefore(firstBirth)) {
            throw new IllegalArgumentException("Date of birth is expected to be after 01.01.1900 and before now.");
        }
        if (firstName.isEmpty() || middleName.isEmpty() || lastName.isEmpty()) {
            throw new IllegalArgumentException("Expected non-empty <first,last,...> name.");
        }
        if (height < 40 || height > 300) {
            throw new IllegalArgumentException("Expected height is between 40 and 300 cm.");
        }
        if (gender != 'M' || gender != 'F') {
            throw new IllegalArgumentException("Expected M or F for gender.");
        }
    }

    private void gender() {
        if (_gender == 'M') {
            _genderSex = "He";
        } else if (_gender == 'F') {
            _genderSex = "She";
        }
    }

    private void addEducation(Education newEducation) {
        this._education.add(newEducation);
    }

    private void removeEducation(Education education) {
        this._education.remove(education);
    }

    public String getGenderSex() {
        return _genderSex;
    }
    Address adress = null;

    @Override
    public String toString() {
        String endResult;
        endResult = String.format("%s %s %s is %d years.old. %s was born in %d.",
                _firstName,
                _middleName,
                _lastName,
                _yearsOld,
                _genderSex,
                _dateOfBirth.getYear());
        if (_yearsOld < 18) {
            endResult += String.format("\n%s %s is under-aged.\n",
                    _firstName,
                    _lastName);
        } else {
            endResult += "\n";
        }
        endResult += String.format("%s lives at:\n", this.getGenderSex());
        endResult += adress.toString() + "\n";

        if (_higherEducation.isGraduated()) {
            endResult += String.format("%s started %s degree in %s on %s and finished on %s. His grade was %.3f.",
                    getGenderSex(),
                    _higherEducation.getDegree(),
                    _higherEducation.getInstitutionName(),
                    _higherEducation.getEnrollmentDate().format(_formatter),
                    _higherEducation.getGraduationDate().format(_formatter),
                    _higherEducation instanceof GradedEducation ? ((GradedEducation) _higherEducation).getFinalGrade() : "");

        } else {
            endResult += String.format("%s started degree in %s on %s and is supposed to graduate on %s.",
                    getGenderSex(),
                    _higherEducation.getDegree(),
                    _higherEducation.getInstitutionName(),
                    _higherEducation.getEnrollmentDate().format(_formatter),
                    _higherEducation.getGraduationDate().format(_formatter));
        }
        return endResult;
    }
}
