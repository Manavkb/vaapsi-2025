package JdbcCode;

import java.sql.*;
import java.util.Scanner;

public class JDBCInsertPrepared {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb"; // change if needed
        String user = "root"; // your MySQL username
        String pass = "openopen2025"; // your MySQL password

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Name: ");
        String name = sc.next();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        try {
            // Load JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to DB
            Connection con = DriverManager.getConnection(url, user, pass);

            // Prepare SQL insert statement
            String sql = "INSERT INTO employee (id, name, salary) VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);

            // Set values
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setDouble(3, salary);

            // Execute insert
            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("✅ Record inserted successfully.");
            }

            // Close resources
            ps.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

