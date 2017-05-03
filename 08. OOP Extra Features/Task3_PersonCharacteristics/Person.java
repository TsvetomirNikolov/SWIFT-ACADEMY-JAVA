package Task3_PersonCharacteristics;

import Task3_PersonCharacteristics.Address;
import Task4_PersonCharacteristics.Education.Education;
import Task4_PersonCharacteristics.Education.GradedEducation;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

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

    private void gender() {
        if (_gender == 'M') {
            _genderSex = "He";
        } else if (_gender == 'F') {
            _genderSex = "She";
        }
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
                    _higherEducation.getEnrollmentDate().format(formatter),
                    _higherEducation.getGraduationDate().format(formatter),
                    _higherEducation instanceof GradedEducation ? ((GradedEducation) _higherEducation).getFinalGrade() : "");

        } else {
            endResult += String.format("%s started %s degree in %s on %s and is supposed to graduate on %s.",
                    getGenderSex(),
                    _higherEducation.getDegree(),
                    _higherEducation.getInstitutionName(),
                    _higherEducation.getEnrollmentDate().format(formatter),
                    _higherEducation.getGraduationDate().format(formatter));
        }
        return endResult;
    }
}
