package Task3_PersonCharacteristics.Education;

import Task3_PersonCharacteristics.Education.Education;
import java.time.LocalDate;

public class PrimaryEducation extends Education {

    public PrimaryEducation(String institutionName, LocalDate enrollmentDate, LocalDate graduationDate, String degree) {
        this.institutionName = institutionName;
        this.enrollmentDate = enrollmentDate;
        this.graduationDate = graduationDate;
        this.degree = degree;
    }

    @Override
    public String getDegree() {
        return this.institutionName;
    }

    @Override
    public void gotGraduated() {
        setGraduated(true);
    }
}
