package Task5_PersonCharacteristics;

import java.time.LocalDate;

public class SecondaryEducation {

    private String _institutionName;
    private LocalDate _enrollmentDate;
    private LocalDate _graduationDate;
    private boolean _graduated;
    private double _finalGrade;

    public SecondaryEducation(String institutionName, LocalDate enrollmentDate, LocalDate graduationDate) {
        this._institutionName = institutionName;
        this._enrollmentDate = enrollmentDate;
        this._graduationDate = graduationDate;
    }

    public SecondaryEducation(String institutionName, LocalDate enrollmentDate, LocalDate graduationDate, double finalGrade) {
        this._institutionName = institutionName;
        this._enrollmentDate = enrollmentDate;
        this._graduationDate = graduationDate;
        this._finalGrade = finalGrade;
        this._graduated = true;
    }

    public void graduate(double finalGrade) {
        this._finalGrade = finalGrade;
        this._graduated = true;
    }

    public String getInstitutionName() {
        return _institutionName;
    }

    public LocalDate getEnrollmentDate() {
        return _enrollmentDate;
    }

    public LocalDate getGraduationDate() {
        return _graduationDate;
    }

    public double getFinalGrade() {
        if (_graduated) {
            return _finalGrade;
        } else {
            return -1;
        }
    }

    public boolean isGraduated() {
        return _graduated;
    }
}
