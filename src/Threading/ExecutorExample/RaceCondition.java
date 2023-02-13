package Threading.ExecutorExample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Task implements Runnable{

    @Override
    public void run() {
        Counter.increment();
    }

}

public class RaceCondition {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        for(int i = 0; i < 1000; i++) {
            executorService.submit(new Task());
        }

        executorService.shutdown();
        //It will wait for all threads to complete its task
        executorService.awaitTermination(60, TimeUnit.SECONDS);

        System.out.println("Final count is : " + Counter.getCount());
    }
}

class Counter {
    static private int count = 0;

    //If synchronized data inconsistency wont happen and print correct value i.e 1000
    public static synchronized void increment() {
        count = count + 1;
    }

    public static int getCount() {
        return count;
    }
}
