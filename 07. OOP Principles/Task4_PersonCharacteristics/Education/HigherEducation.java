package Task4_PersonCharacteristics.Education;

import Task4_PersonCharacteristics.Education.GradedEducation;
import java.time.LocalDate;

public class HigherEducation extends GradedEducation {

    public HigherEducation(String institutionName, LocalDate enrollmentDate, LocalDate graduationDate, String degree) {
        this.institutionName = institutionName;
        this.enrollmentDate = enrollmentDate;
        this.graduationDate = graduationDate;
        this.degree = degree;
    }

    public HigherEducation(String institutionName, LocalDate enrollmentDate, LocalDate graduationDate, String degree, double finalGrade) {
        this(institutionName, enrollmentDate, graduationDate, degree);
        this.finalGrade = finalGrade;
    }

    @Override
    public String getDegree() {
        return this.degree;
    }
}
