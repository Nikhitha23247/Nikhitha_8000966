class MyThread extends Thread {

    String message;

    // constructor
    MyThread(String text) {

        message = text;
    }

    // thread work
    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println(message + " : " + i);
        }
    }
}

public class ThreadExample {

    public static void main(String[] args) {

        // creating two threads
        MyThread t1 = new MyThread("First Thread Running");

        MyThread t2 = new MyThread("Second Thread Running");

        // starting threads
        t1.start();

        t2.start();
    }
}