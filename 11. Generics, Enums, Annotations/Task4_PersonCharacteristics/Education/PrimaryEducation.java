package Education;

import Education.Education;
import java.time.LocalDate;

public class PrimaryEducation extends Education {

    public PrimaryEducation(String institutionName, LocalDate enrollmentDate, LocalDate graduationDate, EducationDegree degree) {
        this.institutionName = institutionName;
        this.enrollmentDate = enrollmentDate;
        this.graduationDate = graduationDate;
        this.degree = degree;
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
