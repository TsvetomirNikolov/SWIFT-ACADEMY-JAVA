package TestJson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.sql.SQLException;

class AddressJsonDto {

    private static String username = "jdbc:mysql://localhost:3306/softunijson";
    private static String url = "root";
    private static String password = "1234567j";

    private static ToMySQL sql = new ToMySQL(username, url, password);

    public static void main(String[] args) throws SQLException {
        AddressJson g = new AddressJson("Tsvetomir", "Nikolov", 24);
        Gson gson = new GsonBuilder().
                excludeFieldsWithoutExposeAnnotation().
                setPrettyPrinting().
                create();

        String json = gson.toJson(g);
        AddressJson s = gson.fromJson(json, AddressJson.class);
        sql.insertUsers(s);
    }
}
