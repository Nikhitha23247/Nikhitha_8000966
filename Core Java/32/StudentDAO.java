package 32;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class StudentDAO {

    private Connection con;

    // Constructor for database connection
    public StudentDAO() {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/studentdb",
                    "root",
                    "root");

            System.out.println("Database Connected");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // Method to insert student record
    public void addStudent(int id, String name, String dept) {

        try {

            String sql =
                    "INSERT INTO students(id,name,department) VALUES(?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setString(3, dept);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Student added successfully");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // Method to update department
    public void updateStudent(int id, String newDept) {

        try {

            String sql =
                    "UPDATE students SET department=? WHERE id=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, newDept);
            ps.setInt(2, id);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Student record updated");
            } else {
                System.out.println("Student not found");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}