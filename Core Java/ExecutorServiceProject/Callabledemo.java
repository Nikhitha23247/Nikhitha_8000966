import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {

    public static void main(String[] args) {

        try {

            // Creating a thread pool with 3 threads
            ExecutorService executor =
                    Executors.newFixedThreadPool(3);

            // Task 1
            Callable<Integer> task1 = () -> {

                System.out.println("Task 1 is running");
                return 10 + 20;
            };

            // Task 2
            Callable<Integer> task2 = () -> {

                System.out.println("Task 2 is running");
                return 50 + 30;
            };

            // Task 3
            Callable<Integer> task3 = () -> {

                System.out.println("Task 3 is running");
                return 100 + 50;
            };

            // Submit tasks
            Future<Integer> result1 =
                    executor.submit(task1);

            Future<Integer> result2 =
                    executor.submit(task2);

            Future<Integer> result3 =
                    executor.submit(task3);

            // Display results
            System.out.println(
                    "Result of Task 1 : "
                            + result1.get());

            System.out.println(
                    "Result of Task 2 : "
                            + result2.get());

            System.out.println(
                    "Result of Task 3 : "
                            + result3.get());

            executor.shutdown();

        } catch (Exception e) {

            System.out.println(e);
        }
    }
}