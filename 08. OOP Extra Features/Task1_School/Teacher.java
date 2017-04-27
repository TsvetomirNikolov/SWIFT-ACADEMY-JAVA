package Task1_School;

public class Teacher {

    private String _name;
    Discipline[] discipline;

    public Teacher(String name, Discipline[] discipline) {
        this._name = name;
        this.discipline = discipline;
    }

    public String getName() {
        return _name;
    }

    public Discipline[] getDiscipline() {
        return discipline;
    }
}
