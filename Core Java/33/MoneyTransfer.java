import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MoneyTransfer {

    public static void main(String[] args) {

        Connection con = null;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/bankdb",
                    "root",
                    "root");

            // disable auto commit
            con.setAutoCommit(false);

            int sender = 101;
            int receiver = 102;
            double amount = 1000;

            // deduct amount from sender
            String debitQuery =
                    "UPDATE accounts SET balance = balance - ? WHERE account_no = ?";

            PreparedStatement debitStmt =
                    con.prepareStatement(debitQuery);

            debitStmt.setDouble(1, amount);
            debitStmt.setInt(2, sender);

            int debitRows = debitStmt.executeUpdate();

            // add amount to receiver
            String creditQuery =
                    "UPDATE accounts SET balance = balance + ? WHERE account_no = ?";

            PreparedStatement creditStmt =
                    con.prepareStatement(creditQuery);

            creditStmt.setDouble(1, amount);
            creditStmt.setInt(2, receiver);

            int creditRows = creditStmt.executeUpdate();

            // both queries successful
            if (debitRows > 0 && creditRows > 0) {

                con.commit();

                System.out.println("Money transferred successfully");
            }
            else {

                con.rollback();

                System.out.println("Transaction failed");
            }

            con.close();

        } catch (Exception e) {

            try {

                if (con != null) {
                    con.rollback();
                }

                System.out.println("Transaction rolled back");

            } catch (Exception ex) {
                System.out.println(ex);
            }

            System.out.println(e);
        }
    }
}