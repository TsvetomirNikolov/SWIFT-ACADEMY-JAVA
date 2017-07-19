
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MySQL {

    private String url = "jdbc:mysql://localhost:3306/softunijson";
    private String root = "root";
    private String password = "1234567j";

    public MySQL(String url, String root, String password) {
        this.url = url;
        this.root = root;
        this.password = password;
    }

    public void toDataBase(Users user) throws SQLException {
        String query = "insert into softunijson.users (first_name,last_name,age)\n"
                + "VALUES ('ivan','nikolov',23)";
        try (Connection conn = DriverManager.getConnection(url, root, password);
                PreparedStatement state = conn.prepareStatement(query)) {
            state.setString(1, user.getFirst_name());
            state.setString(2, user.getLast_name());
            state.setInt(3, user.getAge());
            state.execute();
        } catch (SQLException ex) {
            throw new SQLException("You can't import this user", ex);
        }
    }
}
