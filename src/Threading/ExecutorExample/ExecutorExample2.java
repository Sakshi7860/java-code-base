package Threading.ExecutorExample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorExample2 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(1);
        executor.submit(new Runnable() {

            @Override
            public void run() {
                while (true) {
                    if (Thread.currentThread().isInterrupted()) {
                        System.out.println("interrupted");
                        break;
                    }
                }
            }
        });

        //shutdownNow() will interrupt the running/waiting tasks and terminate the program
        // shutdown() will wait for the running task to complete.

       // executor.shutdownNow();
        executor.shutdown();
        //Wait for the executorService to be shutdown for the specified time
        if (!executor.awaitTermination(1000, TimeUnit.MICROSECONDS)) {
            System.out.println("Still waiting a thread");
            executor.shutdownNow();
        }
    }
}
