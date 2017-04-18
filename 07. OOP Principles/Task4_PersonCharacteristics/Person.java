package Task4_PersonCharacteristics;

import Task4_PersonCharacteristics.Education.Education;
import Task4_PersonCharacteristics.Education.GradedEducation;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person {

    private String _lastName;
    private String _firstName;
    private char _gender;
    private int _yearsOld;
    private double _height;
    private LocalDate _dateOfBirth;
    private String _genderSex;
    private Education _higherEducation;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public Person(String firstName, String lastName, char gender, double height, LocalDate dateOfBirth,
            Education secondaryEducation) {
        this._firstName = firstName;
        this._lastName = lastName;
        this._gender = gender;
        this._height = height;
        this._dateOfBirth = dateOfBirth;
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

    @Override
    public String toString() {
        String endResult;
        if (_higherEducation.isGraduated()) {
            endResult = String.format("%s %s is %d years old. %s was born in %d. %s started %s on %s and finished on %s with a grade of %.3f.",
                    _firstName,
                    _lastName,
                    _yearsOld,
                    _genderSex,
                    _dateOfBirth.getYear(),
                    _genderSex,
                    _higherEducation.getInstitutionName(),
                    _higherEducation.getEnrollmentDate().format(formatter),
                    _higherEducation.getGraduationDate().format(formatter),
                    _higherEducation instanceof GradedEducation ? ((GradedEducation) _higherEducation).getFinalGrade() : "");
        } else {
            endResult = String.format("%s %s is %d years old. %s was born in %d. %s started %s on %s and is supposed to graduate on %s.",
                    _firstName,
                    _lastName,
                    _yearsOld,
                    _genderSex,
                    _dateOfBirth.getYear(),
                    _genderSex,
                    _higherEducation.getInstitutionName(),
                    _higherEducation.getEnrollmentDate().format(formatter),
                    _higherEducation.getGraduationDate().format(formatter));
        }
        if (_yearsOld < 18) {
            endResult += String.format(" %s %s is under-aged.\n",
                    _firstName,
                    _lastName);
        } else {
            endResult += "\n";
        }
        return endResult;
    }
}
