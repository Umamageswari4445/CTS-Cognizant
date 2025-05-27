import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex31_JDBCConnection {
    public static void main(String[] args) {
        // JDBC URL, username, and password of MySQL server
        String url = "jdbc:mysql://localhost:3306/sakila";  // or your selected DB
        String user = "root";        // replace with your username
        String password = "root";  // replace with your password

        try {
            // 1. Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Establish the connection
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println(" Connected to database!");

            // 3. Create a statement
            Statement stmt = conn.createStatement();

            // 4. Execute a SELECT query
            String query = "SELECT * FROM students";
            ResultSet rs = stmt.executeQuery(query);

            // 5. Print the result
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");

                System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
            }

            // 6. Close resources
            rs.close();
            stmt.close();
            conn.close();
            System.out.println(" Disconnected.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
