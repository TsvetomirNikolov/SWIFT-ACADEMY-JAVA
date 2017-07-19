package jsontesttodb;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.sql.SQLException;
import jdk.nashorn.internal.parser.JSONParser;

public class JsonTestToDB implements Serializable {

    private static String url = "jdbc:mysql://localhost:3306/softunijson";
    private static String username = "root";
    private static String password = "1234567j";
    private static MySQLUsersStorage sql = new MySQLUsersStorage(url, username, password);

    public static void main(String[] args) throws SQLException, FileNotFoundException, IOException {
        String path = "E:\\PDF and VIDEOS\\IT\\SWIFT Academy - Java\\JsonTestToDB\\src\\jsontesttodb\\users.JSON";
        JsonTestToDB sd = new JsonTestToDB();
        sd.readFromFile(path);
    }

    public void readFromFile(String path) throws SQLException, FileNotFoundException, IOException {
        Gson gson = new GsonBuilder().
                excludeFieldsWithModifiers().
                setPrettyPrinting().create();
        try (InputStream str = getClass().getResourceAsStream(path);
                BufferedReader bfr = new BufferedReader(new InputStreamReader(str));) {
            Users user = gson.fromJson(bfr, Users.class);
            sql.toDataBase(user);
        } catch (IOException ex) {
            throw new IOException("You can't insert this file!", ex);
        }
    }
}
