package Task2_UniversityManagement;

public class Teacher extends Employee {

    private String[] _teaching;

    public Teacher(String name, String family, String[] teaching) {
        super(name, family, 25);
        this._teaching = teaching;
    }

    @Override
    public void work() {
        Person[] people = Task2_UniversityManagement.getPeople();
        for (Person p : people) {
            if (p != null && !p.equals(this)) {
                if (p instanceof Student) {
                    p.increaseToleration(3);
                } else if (p instanceof MaintenanceEmployee) {
                    p.increaseToleration(-3);
                } else if (p instanceof AdministrationEmployee) {
                    p.increaseToleration(-1);
                }
                if (p.getToleraion() <= 0) {
                    Task2_UniversityManagement.setluckless(p);
                    return;
                }
            }
        }
    }
}
