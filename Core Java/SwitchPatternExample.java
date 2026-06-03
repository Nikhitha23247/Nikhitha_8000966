public class SwitchPatternExample {

    // method to identify data type
    static void findType(Object obj) {

        switch (obj) {

            case Integer number ->

                System.out.println(number + " belongs to Integer type");

            case String text ->

                System.out.println(text + " belongs to String type");

            case Double value ->

                System.out.println(value + " belongs to Double type");

            case Character ch ->

                System.out.println(ch + " belongs to Character type");

            default ->

                System.out.println("Some other type");
        }
    }

    public static void main(String[] args) {

        findType(100);

        findType("Java");

        findType(45.67);

        findType('A');
    }
}