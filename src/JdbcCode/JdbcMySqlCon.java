package JdbcCode;

import java.sql.*;

public class JdbcMySqlCon {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String username = "root";
        String password = "openopen2025";

        try {
            // Load MySQL driver (optional for newer JDBC versions)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 1: Connect
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("✅ Connected to DB");

            // Step 2: Create Statement
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM employee");

            // Step 3: Read data
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " | " +
                        rs.getString("name") + " | " +
                        rs.getDouble("salary"));
            }

            // Step 4: Close resources
            rs.close();
            stmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
