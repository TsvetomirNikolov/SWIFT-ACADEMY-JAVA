package Task2_UniversityManagement;

public abstract class Person {

    private String _name;
    private String _telephone;
    private int _toleraion;

    Person(String name, String telephone) {
        this._name = name;
        this._telephone = telephone;
        this._toleraion = 20;
    }

    public String getName() {
        return _name;
    }

    public String getTelephone() {
        return _telephone;
    }

    public void increaseToleration(int i) {
        this._toleraion += i;
    }

    public int getToleraion() {
        return _toleraion;
    }

    abstract public void work();

    @Override
    public String toString() {
        String endResult = null;
        return endResult = getName() + ", " + getToleraion() + ", ";
    }
}
