package Task4_PersonCharacteristics.Education;

public abstract class GradedEducation extends Education {

    protected double finalGrade;

    public void setFinalGrade(double _finalGrade) {
        this.finalGrade = _finalGrade;
    }

    public double getFinalGrade() {
        if (this.isGraduated()) {
            return finalGrade;
        } else {
            return - 1;
        }
    }

    @Override
    public void gotGraduated() {
        setGraduated(true);
    }

    @Override
    public String getDegree() {
        return this.degree;
    }
}