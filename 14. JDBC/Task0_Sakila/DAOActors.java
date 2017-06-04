package Task0_Sakila;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAOActors extends Actors implements DAOInterface {

    public static final String url = "jdbc:mysql://localhost:3306/sakila";
    public static final String username = "root";
    public static final String password = "1234567j";

    public DAOActors(String firstName, String lastName, int actorId, int filmId) {
        super(firstName, lastName, actorId, filmId);
    }

    @Override
    public int addActors() throws SQLException {
        try (Connection conn = DriverManager.getConnection(url, username, password);
                CallableStatement statement = conn.prepareCall("{call insert_actor (?,?,?)}");) {
            statement.setString("first_name", super.getFirstName());
            statement.setString("last_name", super.getLastName());
            statement.registerOutParameter("new_actor_id", super.getActorId());
            statement.execute();
            return statement.getInt("new_actor_id");
        }
    }

    @Override
    public void addActorToFilm() throws SQLException {
        try (Connection conn = DriverManager.getConnection(url, username, password);
                CallableStatement statement = conn.prepareCall("INSERT INTO sakila.film_actor"
                        + "(actor_id,film_id) VALUES (?,?)");) {
            statement.setInt(1, super.getActorId());
            statement.setInt(2, super.getFilmId());
            statement.execute();
        }
    }

    @Override
    public int getActorFromID() throws SQLException {
        try (Connection conn = DriverManager.getConnection(url, username, password);
                PreparedStatement statement = conn.prepareCall("SELECT actor_id FROM actor WHERE first_name=? AND last_name=?");) {
            statement.setString(1, super.getFirstName());
            statement.setString(2, super.getLastName());
            ResultSet set = statement.executeQuery();
            set.next();
            return set.getInt("actor_id");
        }
    }
}
