package Java;

import java.sql.*;
import java.util.Scanner;

public class StudentDatabase {
    private static final String DB_URL ="jdbc:mysql://localhost:3306/school";
    private static final String USER ="root";
    private static final String PASS ="";

    public static void main(String[] args) {
        try {
            // Connect to the database

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();

            // Create table
            String createTableSQL = "CREATE TABLE IF NOT EXISTS students " +
                                    "(id INT AUTO_INCREMENT PRIMARY KEY, " +
                                    " name VARCHAR(255), " +
                                    " grade FLOAT)";
            stmt.executeUpdate(createTableSQL);

            // Insert student records
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();
            System.out.print("Enter student grade: ");
            float grade = scanner.nextFloat();
            String insertSQL = "INSERT INTO students (name, grade) VALUES ('" + name + "', " + grade          + ")";
            stmt.executeUpdate(insertSQL);

            // Retrieve and display student records
            String selectSQL = "SELECT * FROM students";
            ResultSet rs = stmt.executeQuery(selectSQL);
            System.out.println("Students in the database:");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name") + ", Grade: " + rs.getFloat("grade"));
            }

            // Clean up
            rs.close();
            stmt.close();
            conn.close();
            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

/*
Enter student name: Gowtham
Enter student grade: 40.8
Students in the database:
ID: 1, Name: Gowtham, Grade: 40.8
 */