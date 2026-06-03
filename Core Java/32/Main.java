public class Main {

    public static void main(String[] args) {

        StudentDAO dao = new StudentDAO();

        // Insert new student
        dao.addStudent(
                101,
                "Nikhitha",
                "AIML"
        );

        // Update department
        dao.updateStudent(
                101,
                "Data Science"
        );
    }
}