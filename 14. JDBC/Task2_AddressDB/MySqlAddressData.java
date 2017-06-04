package Task2_AddressDB;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MySqlAddressData {

    private static final String url = "jdbc:mysql://localhost:3306/addessdb";
    private static final String username = "root";
    private static final String password = "1234567j";

    public Map<Integer, String> getFullAddress(int id) throws SQLException {
        Map<Integer, String> fullAddress = new HashMap<>();
        try (Connection conn = DriverManager.getConnection(url, username, password);
                CallableStatement state = conn.prepareCall("call getFullAddress (?)");) {
            state.setInt("_id", id);
            ResultSet set = state.executeQuery();
            while (set.next()) {
                fullAddress.put(1, Integer.toString(set.getInt("number")));
                fullAddress.put(2, set.getString("streetName"));
                fullAddress.put(3, Integer.toString(set.getInt("apartmentNo")));
                fullAddress.put(4, set.getString("populatedAreasName"));
                fullAddress.put(5, set.getString("regionsName"));
                fullAddress.put(6, set.getString("countryName"));
            }
        }
        return fullAddress;
    }

    public void addAddress(int id, int number, int apartmentNo) throws SQLException {
        try (Connection conn = DriverManager.getConnection(url, username, password);
                CallableStatement call = conn.prepareCall("call addAddress (?,?,?)");) {
            call.setInt("_id", id);
            call.setInt("_number", number);
            call.setInt("_apartmentNo", apartmentNo);
            call.execute();
        }
    }
}
