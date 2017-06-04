package Task0_Sakila;

import java.sql.SQLException;

public interface DAOInterface {

    public int addActors() throws SQLException;

    public void addActorToFilm() throws SQLException;

    public int getActorFromID() throws SQLException;

}
