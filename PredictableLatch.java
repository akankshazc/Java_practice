// Chapter 17

import java.util.concurrent.*;

class PredictableLatch {

    public static void main(String[] args) {

        ExecutorService executor = Executors.newSingleThreadExecutor();
        CountDownLatch latch = new CountDownLatch(1);

        executor.execute(() -> waitForLatchThenPrint(latch));

        System.out.println("Back in main");
        latch.countDown();

        executor.shutdown();

    }

    private static void waitForLatchThenPrint(CountDownLatch latch) {

        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Top of the stack");
    }
}
