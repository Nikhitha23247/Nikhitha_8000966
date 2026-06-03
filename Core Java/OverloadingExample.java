public class OverloadingExample {
    static int add(int x, int y) {
        return x + y;
    }
    static double add(double x, double y) {
        return x + y;
    }
    static int add(int x, int y, int z) {
        return x + y + z;
    }
    public static void main(String[] args) {
        int firstResult = add(15, 25);
        double secondResult = add(12.5, 7.5);
        int thirdResult = add(5, 10, 15);
        System.out.println("Addition of two integers : " + firstResult);
        System.out.println("Addition of two double values : " + secondResult);
        System.out.println("Addition of three integers : " + thirdResult);
    }
}