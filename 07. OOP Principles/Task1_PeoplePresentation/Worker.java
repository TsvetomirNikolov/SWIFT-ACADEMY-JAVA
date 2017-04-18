
public class Worker extends Person {

    private double _weekSalary;
    private double _workHoursPerDay;

    public Worker(String firstName, String lastName, double weekSalary, double workHoursPerDay) {
        super(firstName, lastName);
        this._weekSalary = weekSalary;
        this._workHoursPerDay = workHoursPerDay;
    }

    void setWeekSalary(double weekSal) {
        if (weekSal < 0) {
            System.out.println("Expected positive number for week salary.");
        } else {
            this._weekSalary = weekSal;
        }
    }

    void setWorkHoursPerDay(double workHoursPerDay) {
        if (workHoursPerDay < 0) {
            System.out.println("Expected positive number for workHoursPerDay.");
        } else {
            this._workHoursPerDay = workHoursPerDay;
        }
    }

    public double getWorkHoursPerDay() {
        return _workHoursPerDay;
    }

    private double getWeekSalary() {
        return _weekSalary;
    }

    public void printInfo() {
        System.out.println("First name: " + this.firstName);
        System.out.println("Last name: " + this.lastName);
        System.out.println("Occupation: Worker");
        System.out.printf("Week salary: %.2f\n", getWeekSalary());
        System.out.printf("Hours per day: %.6f \n", getWorkHoursPerDay());
        System.out.printf("Salary per hour: %.2f \n", this._weekSalary / (this._workHoursPerDay * 5.0));
    }
}
