package Education;

import Education.GradedEducation;
import java.time.LocalDate;

public class HigherEducation extends GradedEducation {

    public HigherEducation(String institutionName, LocalDate enrollmentDate, LocalDate graduationDate, EducationDegree degree) {
        this.institutionName = institutionName;
        this.enrollmentDate = enrollmentDate;
        this.graduationDate = graduationDate;
        this.degree = degree;
    }

    public HigherEducation(String institutionName, LocalDate enrollmentDate, LocalDate graduationDate, EducationDegree degree, double finalGrade) {
        this(institutionName, enrollmentDate, graduationDate, degree);
        this.finalGrade = finalGrade;
    }
}
