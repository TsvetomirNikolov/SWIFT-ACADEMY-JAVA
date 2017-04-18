package Task3_FileManagement;

import java.time.LocalDate;

public class File {

    private String _name;
    private String _locations;
    private LocalDate _date;
    private boolean _isDeleted;

    File(String name, String locations) {
        this._name = name;
        this._locations = locations;
        this._date = LocalDate.now();
        this._isDeleted = false;
    }

    private void move(String newLocation) {
        this._locations = newLocation;
    }

    private String copy(String newLocation) {
        this._locations = newLocation;
        return _locations;
    }

    private void delete() {
        this._isDeleted = true;
    }

    private void execute(boolean _isDeleted) {
        this._isDeleted = _isDeleted;
    }

    public String getName() {
        return _name;
    }

    public String getLocations() {
        return _locations;
    }

    public LocalDate getDate() {
        return _date;
    }

    void getInfo() {
        System.out.println("Name: " + this.getName() + this.getDate() + "Creation date: " + this.getDate() + "\n");
    }
}
