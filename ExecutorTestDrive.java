// Chapter 17

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ExecutorTestDrive {

    public static void main(String[] args) {

        ExecutorService executor = Executors.newSingleThreadExecutor();

        executor.execute(() -> System.out.println("Top of the stack"));

        System.out.println("Back in main");
        executor.shutdown();
    }
}

class ThreadTestDrive {

    public static void main(String[] args) {

        Thread myThread = new Thread(() -> System.out.println("Top of the stack"));

        myThread.start();
        System.out.println("Back in main");
    }
}