package Task2_UniversityManagement;

import java.util.List;

public class AdministrationEmployee extends Employee {

    private String[] _teach;

    public AdministrationEmployee(String name, String family, String[] teach) {
        super(name, family, 19);
        this._teach = teach;
    }

    @Override
    public void work() {
        Person[] people = Task2_UniversityManagement.getPeople();
        for (Person p : people) {
            if (p != null && !p.equals(this)) {
                if (p instanceof Student) {
                    p.increaseToleration(3);
                } else if (p instanceof Teacher) {
                    p.increaseToleration(3);
                } else if (p instanceof MaintenanceEmployee) {
                    p.increaseToleration(1);
                }
            }
        }
    }
}
