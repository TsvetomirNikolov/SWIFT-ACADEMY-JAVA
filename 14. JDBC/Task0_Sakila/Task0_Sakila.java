package Task0_Sakila;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.Scanner;

public class Task0_Sakila {

    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        int actorId = scanner.nextInt();
        int filmId = scanner.nextInt();
        DAOActors dao = new DAOActors(firstName, lastName, actorId, filmId);
        System.out.println(dao.getLastName());
        System.out.println(dao.getLastName());
        System.out.println(dao.getActorId());
        System.out.println(dao.getFilmId());
    }
}
