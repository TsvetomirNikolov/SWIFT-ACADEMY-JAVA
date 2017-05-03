package Task1_School;

public class Teacher {

    private String _name;
    private Discipline[] _disciplines;

    public Teacher(String name, Discipline[] discipline) {
        this._name = name;
        this._disciplines = discipline;
    }

    public String getName() {
        return _name;
    }

    public Discipline[] getDisciplines() {
        return _disciplines;
    }
}
