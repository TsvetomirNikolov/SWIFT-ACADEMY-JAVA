package Task2_UniversityManagement;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {

    private String _facultyNumber;
    private String[] _objects;

    Student(String name, String family, String facultyNumber, String[] object) {
        super(name, family);
        this._facultyNumber = facultyNumber;
        this._objects = object;
    }

    public String getFacultyNumber() {
        return _facultyNumber;
    }

    public String[] getObjects() {
        return _objects;
    }

    @Override
    public void work() {
        Person[] people = Task2_UniversityManagement.getPeople();
        for (Person p : people) {
            if (p != null && !p.equals(this)) {
                if (p instanceof Student) {
                    p.increaseToleration(2);
                } else if (p instanceof MaintenanceEmployee) {
                    p.increaseToleration(-1);
                }
            }
            if (this.getToleraion() >= 50) {
                Task2_UniversityManagement.increaseBudget(10);
            }
            if (this.getToleraion() <= 0) {
                Task2_UniversityManagement.setluckless(p);
                return;
            }
        }
    }
}
