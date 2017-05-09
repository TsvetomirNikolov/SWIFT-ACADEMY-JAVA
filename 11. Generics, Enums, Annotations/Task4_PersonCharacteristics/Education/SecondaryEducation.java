package Education;

import java.time.LocalDate;

public class SecondaryEducation extends GradedEducation {

    private String _institutionName;
    private LocalDate _enrollmentDate;
    private LocalDate _graduationDate;
    private boolean _graduated;
    private double _finalGrade;

    public SecondaryEducation(String institutionName, LocalDate enrollmentDate, LocalDate graduationDate, EducationDegree degree) {
        this._institutionName = institutionName;
        this._enrollmentDate = enrollmentDate;
        this._graduationDate = graduationDate;
        this.degree = degree;
    }

    public SecondaryEducation(String institutionName, LocalDate enrollmentDate, LocalDate graduationDate, EducationDegree degree, double finalGrade) {
        this(institutionName, enrollmentDate, graduationDate, degree);
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

    @Override
    public EducationDegree getDegree() {
        return this.degree;
    }

    @Override
    public void gotGraduated() {
        setGraduated(true);
    }
}
