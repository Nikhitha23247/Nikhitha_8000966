public class OperatorCheck {
    public static void main(String[] args) {
        int value1 = 10 + 5 * 2;
        int value2 = (10 + 5) * 2;
        int value3 = 20 / 2 + 3 * 4;
        
        System.out.println("First expression answer : " + value1);
        System.out.println("Second expression answer : " + value2);
        System.out.println("Third expression answer : " + value3);
        System.out.println();
        // simple explanation
        System.out.println("Order of operations in Java:");
        System.out.println("* and / are calculated first");
        System.out.println("Then + and - are calculated");
        System.out.println("Brackets () are given highest priority");
    }
}