package Task1_School;

public class Student {

    private String _name;
    private String _schoolNumber;

    public Student(String name, String schoolNumber) {
        this._name = name;
        this._schoolNumber = schoolNumber;
    }

    @Override
    public String toString() {
        return String.format("%s school number is %s", this._name, this._schoolNumber);
    }
}
