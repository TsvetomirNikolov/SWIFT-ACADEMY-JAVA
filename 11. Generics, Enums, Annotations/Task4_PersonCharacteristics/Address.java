package Task4_PersonCharacteristics;

public class Address {

    private String _country;
    private String _city;
    private String _municipality;
    private int _postalCode;
    private String _street;
    private String _number;
    private String _floor;
    private String _apartmentNo;

    public Address(String country, String city, String municipality, int postalCode, String street, String number, String floor, String apartamentNo) {
        this._country = country;
        this._city = city;
        this._municipality = municipality;
        this._postalCode = postalCode;
        this._street = street;
        this._floor = floor;
        this._number = number;
        this._apartmentNo = apartamentNo;
    }

    public Address(String country, String city, String municipality, int postalCode, String street, String number) {
        this(country, city, municipality, postalCode, street, number, null, null);
    }

    public Address(String country, String city, String municipality, int postalCode, String street, String number, String floor) {
        this(country, city, municipality, postalCode, street, number, floor, null);
    }

    @Override
    public String toString() {
        return String.format(
                "%s %s Street"
                + "\nfl. %s, ap. %s"
                + "\n%d %s"
                + "\n%s, %s",
                this._number, this._street,
                this._floor, this._apartmentNo,
                this._postalCode, this._municipality,
                this._city, this._country);
    }
}
