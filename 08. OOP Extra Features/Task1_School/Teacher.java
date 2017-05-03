package Task1_School;

public class Teacher {

    private String _name;
    private Discipline[] _discipline;

    public Teacher(String name, Discipline[] discipline) {
        this._name = name;
        this._discipline = discipline;
    }

    public String getName() {
        return _name;
    }

    public Discipline[] getDiscipline() {
        return _discipline;
    }
}
