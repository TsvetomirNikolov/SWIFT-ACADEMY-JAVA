package TestJson;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ToMySQL {

    private String username = "jdbc:mysql://localhost:3306/softunijson";
    private String url = "root";
    private String password = "1234567j";

    public ToMySQL(String username, String url, String password) {
        this.username = username;
        this.url = url;
        this.password = password;
    }

    public void insertUsers(AddressJson users) throws SQLException {
        String query = "INSERT INTO softunijson.users (first_name,last_name,age) VALUES (?,?,?)";
        try (Connection conn = DriverManager.getConnection(username, url, password);
                PreparedStatement state = conn.prepareStatement(query);) {
            state.setString(1, users.getFirst_name());
            state.setString(2, users.getLast_name());
            state.setInt(3, users.getAge());
            state.execute();
        }
    }
}
