package pkg10.data.Task9_PersonCharacteristicss;

import pkg10.data.Task9_PersonCharacteristicss.Education;
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
