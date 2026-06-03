import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;

public class JdbcStudentDemo {

    public static void main(String[] args) {

        try {

            // Step 1 : Load JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2 : Create Database Connection
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/studentdb",
                    "root",
                    "root");

            System.out.println("Database Connected");

            // Step 3 : SQL Query
            String sql = "SELECT * FROM students";

            // Step 4 : Create Statement
            Statement stmt = conn.createStatement();

            // Step 5 : Execute Query
            ResultSet rs = stmt.executeQuery(sql);

            System.out.println("\nStudent Details");

            while(rs.next()) {

                System.out.println(
                        rs.getInt("id") + "  " +
                        rs.getString("name") + "  " +
                        rs.getString("department"));
            }

            // Step 6 : Close Resources
            rs.close();
            stmt.close();
            conn.close();

        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
public class jdbcStudentDemo {

    public static void main(String[] args) {

        Connection conn = null;

        try {

            // loading mysql driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // creating connection
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/studentdb",
                    "root",
                    "root"
            );

            System.out.println("Database connected successfully");

            String query = "SELECT * FROM students";

            Statement stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery(query);

            System.out.println("\nStudent Records");
            System.out.println("-------------------------");

            while (rs.next()) {

                int id = rs.getInt("id");
                String name = rs.getString("name");
                String dept = rs.getString("department");

                System.out.println(
                        "ID : " + id +
                        " | Name : " + name +
                        " | Department : " + dept
                );
            }

            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {

            System.out.println("Error : " + e.getMessage());
        }
    }
}