package Task3_PersonCharacteristics;

public class Address {

    private String _country;
    private String _city;
    private String _municipality;
    private int _postalCode;
    private String _street;
    private int _number;
    private int _floor;
    private String _apartmentNo;

    public Address(String country, String city, String municipality, int postalCode, String street, int number, int floor, String apartamentNo) {
        this._country = country;
        this._city = city;
        this._municipality = municipality;
        this._postalCode = postalCode;
        this._street = street;
        this._floor = floor;
        this._number = number;
        this._apartmentNo = apartamentNo;
    }

    public Address(String country, String city, String municipality, int postalCode, String street, int number) {
        this(country, city, municipality, postalCode, street, number, 0, null);
    }

    public Address(String country, String city, String municipality, int postalCode, String street, int number, int floor) {
        this(country, city, municipality, postalCode, street, number, 0, null);
    }

    public Address(String country, String city, String municipality, int postalCode, String street, int number, String apartmentNo) {
        this(country, city, municipality, postalCode, street, number, 0, apartmentNo);
    }

    @Override
    public String toString() {
        return String.format(
                "%d %s Street"
                + "\n fl. %d, ap. %d"
                + "\n %d, %s"
                + "\n %s, %s",
                this._number, this._street,
                this._floor, this._apartmentNo,
                this._postalCode, this._municipality,
                this._city, this._country);
    }
}
