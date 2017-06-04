package Task1_School;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.Scanner;

public class Task1_School {

    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        int id = Integer.parseInt(scanner.nextLine());
        String name = scanner.nextLine();
        String email = scanner.nextLine();
        String enrollment_date = scanner.nextLine();
        double salary = Double.parseDouble(scanner.nextLine());
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        String disciplines = scanner.nextLine();
        MySqlSchoolData sql = new MySqlSchoolData();
        sql.insertTeacher(name, email, id, salary);
        System.out.println(sql.getTeacher(id));
        sql.getTeachers(x, y).stream().forEach(System.out::println);
        sql.insertStudent(id, name, enrollment_date);
        sql.getTeachersByDisciplineName(disciplines).stream().forEach(System.out::println);
    }
}
