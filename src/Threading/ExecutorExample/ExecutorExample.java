package Threading.ExecutorExample;

import java.util.concurrent.*;

class RunnableImplement implements Runnable{

    public void run(){
        System.out.println("Hello");
    }

}
class ExecutorsExample {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Inside : " + Thread.currentThread().getName());

        System.out.println("Creating Executor Service...");
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        System.out.println("Creating a Runnable...");
        Runnable runnable1 = new RunnableImplement();
        Runnable runnable2 = new RunnableImplement();
        Runnable runnable3 = new RunnableImplement();

        System.out.println("Submit the task specified by the runnable to the executor service.");
        executorService.submit(runnable1);

        executorService.submit(runnable2);
        executorService.shutdown();
        //Its not allowed to submit more tasks to executive service after shutdown call.
        //shutdown() indicates that whatever tasks were submitted, just complete that one.
        executorService.submit(runnable3);
        executorService.awaitTermination(1000, TimeUnit.SECONDS);


    }
}