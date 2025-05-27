import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Ex32_InsertUpdateJDBC {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/sakila"; // or your DB
        String user = "root";
        String password = "root";

        try {
            // 1. Load JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Connect to the database
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to database!");

            // ===== INSERT Operation =====
            String insertQuery = "INSERT INTO students (id, name, age) VALUES (?, ?, ?)";
            PreparedStatement insertStmt = conn.prepareStatement(insertQuery);
            insertStmt.setInt(1, 101);
            insertStmt.setString(2, "John Doe");
            insertStmt.setInt(3, 22);
            int rowsInserted = insertStmt.executeUpdate();
            System.out.println(rowsInserted + " row(s) inserted.");

            // ===== UPDATE Operation =====
            String updateQuery = "UPDATE students SET age = ? WHERE id = ?";
            PreparedStatement updateStmt = conn.prepareStatement(updateQuery);
            updateStmt.setInt(1, 23);   // New age
            updateStmt.setInt(2, 101);  // Student ID
            int rowsUpdated = updateStmt.executeUpdate();
            System.out.println(rowsUpdated + " row(s) updated.");

            // 3. Close resources
            insertStmt.close();
            updateStmt.close();
            conn.close();
            System.out.println("Disconnected.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
