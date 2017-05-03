package pkg10.data.Task9_PersonCharacteristicss;

import java.time.LocalDate;

public abstract class Education {

    protected boolean graduated;
    protected LocalDate enrollmentDate;
    protected LocalDate graduationDate;
    protected String institutionName;
    protected String degree;

    public abstract String getDegree();

    public abstract void gotGraduated();

    public void setGraduationDate(LocalDate graduationDate) {
        if (graduationDate.isBefore(enrollmentDate)) {
            throw new IllegalArgumentException("Graduation date is expected to be after enrollment date.");
        }
        if (graduationDate.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("Graduation date is expected to be a date in the past.");
        }
        this.graduationDate = graduationDate;
    }

    public void setGraduated(boolean graduated) {
        this.graduated = graduated;
    }

    public boolean isGraduated() {
        return graduated;
    }

    public LocalDate getEnrollmentDate() {
        return enrollmentDate;
    }

    public LocalDate getGraduationDate() {
        return graduationDate;
    }

    public String getInstitutionName() {
        return institutionName;
    }
}
