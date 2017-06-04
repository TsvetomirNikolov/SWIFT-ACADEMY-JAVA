package Task1_School;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MySqlSchoolData {

    private static final String url = "jdbc:mysql://localhost:3306/school";
    private static final String username = "root";
    private static final String password = "1234567j";

    public void insertTeacher(String name, String email, int id, double salary) throws SQLException {
        try (Connection conn = DriverManager.getConnection(url, username, password);
                PreparedStatement statement
                = conn.prepareStatement("INSERT INTO teachers(id,name,email,salary) VALUES(?,?,?,?)");) {
            statement.setInt(1, id);
            statement.setString(2, name);
            statement.setString(3, email);
            statement.setDouble(4, salary);
            statement.execute();
        }
    }

    public List<String> getTeacher(int id) throws SQLException {
        List<String> teachers = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(url, username, password);
                PreparedStatement statement = conn.prepareStatement("SELECT * FROM teachers WHERE id = (?)");) {
            statement.setInt(1, id);
            ResultSet set = statement.executeQuery();
            while (set.next()) {
                teachers.add(set.getString("name"));
                teachers.add(set.getString("email"));
                teachers.add(Double.toString(set.getDouble("salary")));
            }
        }
        return teachers;
    }

    public List<String> getTeachers(double x, double y) throws SQLException {
        List<String> teachers = new ArrayList<>();
        String query = "SELECT * FROM school.teachers WHERE salary BETWEEN (?) AND (?)";
        try (Connection conn = DriverManager.getConnection(url, username, password);
                PreparedStatement statement = conn.prepareStatement(query);) {
            statement.setDouble(1, x);
            statement.setDouble(2, y);
            ResultSet set = statement.executeQuery();
            while (set.next()) {
                teachers.add(set.getString("name"));
                teachers.add(set.getString("email"));
                teachers.add(Double.toString(set.getDouble("salary")));
                teachers.add(Integer.toString(set.getInt("id")));
            }
        }
        return teachers;
    }

    public void insertStudent(int id, String name, String enrollment_date) throws SQLException {
        try (Connection conn = DriverManager.getConnection(url, username, password);
                PreparedStatement statement = conn.prepareStatement("INSERT INTO students(id,name,enrollment_date) VALUES (?,?,?)");) {
            statement.setInt(1, id);
            statement.setString(2, name);
            statement.setString(3, enrollment_date);
            statement.execute();
        }
    }

    public List<String> getStudents(int id) throws SQLException {
        List<String> students = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(url, username, password);
                PreparedStatement statement = conn.prepareStatement("SELECT * FROM students WHERE id = (?)");) {
            statement.setInt(1, id);
            ResultSet set = statement.executeQuery();
            while (set.next()) {
                students.add(Integer.toString(set.getInt("id")));
                students.add(set.getString("name"));
                students.add(set.getString("enrollment_date"));
            }
            return students;
        }
    }

    public List<Integer> getDisciplinesByTeacherId(int id) throws SQLException {
        List<Integer> teacherId = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(url, username, password);
                PreparedStatement statement = conn.prepareCall("SELECT id FROM school.teachers AS t INNER JOIN school.disciplines_taught AS d ON t.id = d.id_discipline");) {
            ResultSet set = statement.executeQuery();
            teacherId.add(set.getInt("id"));
        }
        return teacherId;
    }

    public List<String> getTeachersByDisciplineName(String discipline) throws SQLException {
        List<String> teachersByDiscipline = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(url, username, password);
                CallableStatement statement = conn.prepareCall("{call getTeachersByDisciplineName (?)}");) {
            statement.setString("disciplines", discipline);
            ResultSet set = statement.executeQuery();
            while (set.next()) {
                teachersByDiscipline.add(set.getString("name"));
            }
        }
        return teachersByDiscipline;
    }
}
