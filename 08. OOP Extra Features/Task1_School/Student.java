package Task1_School;

public class Student {

    private String _name;
    private String _schoolNumber;

    public Student(String name, String schoolNumber) {
        this._name = name;
        this._schoolNumber = schoolNumber;
    }

    public String getName() {
        return _name;
    }

    public String getSchoolNumber() {
        return _schoolNumber;
    }

    @Override
    public String toString() {
        return String.format("%s school number is %s", this.getName(), this.getSchoolNumber());
    }
}
