public class TypeCastingExample {
    public static void main(String[] args) {
        // double to int conversion
        double decimalNumber = 45.89;
        int wholeNumber = (int) decimalNumber;
        System.out.println("Original double value: " + decimalNumber);
        System.out.println("After converting to int: " + wholeNumber);
        System.out.println();
        // int to double conversion
        int number = 25;
        double convertedValue = (double) number;
        System.out.println("Original int value: " + number);
        System.out.println("After converting to double: " + convertedValue);
    }
}