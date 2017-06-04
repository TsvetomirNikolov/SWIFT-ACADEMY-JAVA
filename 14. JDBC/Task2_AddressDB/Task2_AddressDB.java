package Task2_AddressDB;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task2_AddressDB {

    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        int id = Integer.parseInt(scanner.nextLine());
        int number = Integer.parseInt(scanner.nextLine());
        int apartmentNo = Integer.parseInt(scanner.nextLine());
        MySqlAddressData data = new MySqlAddressData();
        Map<Integer, String> address = data.getFullAddress(id);
        for (Map.Entry<Integer, String> adres : address.entrySet()) {
            switch (id) {
                case 3:
                    System.out.println(adres.getValue());
                    break;
                case 5:
                    System.out.println(adres.getValue());
                    break;
                default:
                    System.out.println(adres.getValue());
                    break;
            }
        }
        data.addAddress(id, number, apartmentNo);
    }
}
