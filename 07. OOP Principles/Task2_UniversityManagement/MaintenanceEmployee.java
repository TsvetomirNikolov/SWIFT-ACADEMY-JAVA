package Task2_UniversityManagement;

public class MaintenanceEmployee extends Employee {

    public MaintenanceEmployee(String name, String family) {
        super(name, family, 15);
    }

    @Override
    public void work() {
        Person[] people = Task2_UniversityManagement.getPeople();
        for (Person p : people) {
            if (p != null && !p.equals(this)) {
                p.increaseToleration(2);
            }
        }
    }
}
