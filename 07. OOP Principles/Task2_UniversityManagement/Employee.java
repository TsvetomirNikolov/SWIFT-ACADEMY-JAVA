package Task2_UniversityManagement;

public abstract class Employee extends Person {

    private double _salaryPerHour;

    Employee(String name, String family, double salaryPerHour) {
        super(name, family);
        this._salaryPerHour = salaryPerHour;
    }

    public double getSalaryPerHour() {
        return _salaryPerHour;
    }
}
