public class Demo {

    private String studentName;

    public DemoProgram(String studentName) {

        this.studentName = studentName;
    }

    public void displayDetails() {

        System.out.println("Student Name : " + studentName);
    }

    public static void main(String[] args) {

        DemoProgram obj =
                new DemoProgram("Nikhitha");

        obj.displayDetails();
    }
}