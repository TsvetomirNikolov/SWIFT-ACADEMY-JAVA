package pkg10.data.Task9_PersonCharacteristicss;

public abstract class GradedEducation extends Education {

    protected double finalGrade;

    public void setFinalGrade(double _finalGrade) {
        this.finalGrade = _finalGrade;
    }

    public double getFinalGrade() {
        if (this.isGraduated()) {
            return finalGrade;
        } else {
            throw new IllegalArgumentException("No final grade can be provided before graduation.");
        }
    }

    @Override
    public void gotGraduated() {
        if (finalGrade < 2 || finalGrade > 6) {
            throw new IllegalArgumentException("Graduation grade is expected to be between 2 and 6.");
        }
        setGraduated(true);
    }

    @Override
    public String getDegree() {
        return this.degree;
    }
}
