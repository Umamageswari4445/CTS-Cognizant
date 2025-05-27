import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class Ex33_TransactionJDBC {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/sakila";
        String user = "root";
        String password = "root";

        try {
            // 1. Load driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Connect to database
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to database!");

            // 3. Start transaction
            conn.setAutoCommit(false); // Very important!

            // 4. Debit from Account 1
            String debitQuery = "UPDATE accounts SET balance = balance - ? WHERE id = ?";
            PreparedStatement debitStmt = conn.prepareStatement(debitQuery);
            debitStmt.setDouble(1, 200.00); // amount
            debitStmt.setInt(2, 1);         // from ID
            debitStmt.executeUpdate();

            // 5. Credit to Account 2
            String creditQuery = "UPDATE accounts SET balance = balance + ? WHERE id = ?";
            PreparedStatement creditStmt = conn.prepareStatement(creditQuery);
            creditStmt.setDouble(1, 200.00); // amount
            creditStmt.setInt(2, 2);         // to ID
            creditStmt.executeUpdate();

            // 6. If both succeed, commit
            conn.commit();
            System.out.println("Transaction successful. Money transferred.");

            // 7. Cleanup
            debitStmt.close();
            creditStmt.close();
            conn.close();
            System.out.println("Disconnected.");

        } catch (Exception e) {
            e.printStackTrace();
            try {
                System.out.println("Rolling back due to error...");
                // Rollback if anything goes wrong
                DriverManager.getConnection(url, user, password).rollback();
            } catch (Exception rollbackEx) {
                rollbackEx.printStackTrace();
            }
        }
    }
}


