package Task1_School;

public class Discipline {

    private String _name;
    private double _numberHours;

    public Discipline(String name, double numberHours) {
        this._name = name;
        this._numberHours = numberHours;
    }

    public String getName() {
        return _name;
    }

    public double getNumberHours() {
        return _numberHours;
    }
}
