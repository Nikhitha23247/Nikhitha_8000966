import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ReflectionDemo {

    public static void main(String[] args) {

        try {

            // Load class dynamically
            Class<?> cls = Class.forName("Student");

            System.out.println("Class Name : "
                    + cls.getName());

            System.out.println("\nMethods Available:");

            Method[] methods = cls.getDeclaredMethods();

            for (Method method : methods) {

                System.out.print(method.getName());

                Parameter[] params =
                        method.getParameters();

                System.out.print(" (");

                for (int i = 0; i < params.length; i++) {

                    System.out.print(
                            params[i].getType().getSimpleName());

                    if (i < params.length - 1) {
                        System.out.print(", ");
                    }
                }

                System.out.println(")");
            }

            // Create object dynamically
            Object obj =
                    cls.getDeclaredConstructor()
                            .newInstance();

            // Call greet() method
            Method greetMethod =
                    cls.getMethod("greet");

            greetMethod.invoke(obj);

        } catch (Exception e) {

            System.out.println(e);
        }
    }
}