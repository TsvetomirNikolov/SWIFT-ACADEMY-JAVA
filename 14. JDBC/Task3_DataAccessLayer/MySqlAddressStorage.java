package Task3_DataAccessLayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MySqlAddressStorage implements AddressStorage {

    private final static String url = "jdbc:mysql://localhost/citizen_registrations";
    private final static String username = "root";
    private final static String password = "1234567j";

    @Override
    public Address getAddress(int id) throws DALException {
        Address address = null;
        try (Connection conn = DriverManager.getConnection(url, username, password);
                PreparedStatement state = conn.prepareStatement("SELECT * FROM citizen_registrations.addresses WHERE id = ?");) {
            state.setInt(1, id);
            ResultSet set = state.executeQuery();
            while (set.next()) {
                String country = set.getString("country");
                String city = set.getString("city");
                String municipality = set.getString("municipality");
                String postal_code = set.getString("postal_code");
                String street = set.getString("street");
                String number = set.getString("number");
                int floor = set.getInt("floor");
                int apartmentNo = set.getInt("apartmentNo");
                address = new Address(country, city, municipality, postal_code, street, number, floor, apartmentNo);
            }
        } catch (SQLException ex) {
            throw new DALException("You couldn't get the address with ID = " + id, ex);
        }
        return address;
    }

    @Override
    public int insertAddress(Address address) throws DALException {
        String query
                = "INSERT INTO addresses(country,city, municipality,postal_code,street,number,floor,apartmentNo) VALUES (?,?,?,?,?,?,?,?)";
        try (Connection conn = DriverManager.getConnection(url, username, password);
                PreparedStatement state = conn.prepareStatement(query);) {
            ResultSet set = state.executeQuery();
            state.setString(1, address.getCountry());
            state.setString(2, address.getCity());
            state.setString(3, address.getMunicipality());
            state.setString(4, address.getPostalCode());
            state.setString(5, address.getStreet());
            state.setString(6, address.getNumber());
            state.setInt(7, address.getFloor());
            state.setInt(8, address.getApartmentNo());
            state.execute();
            return set.getInt("id");

        } catch (SQLException ex) {
            throw new DALException("You can't insert this address!", ex);
        }
    }
}
