package Threading.MergeSortMultiThreading;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> arrayToSort= Arrays.asList(4, 2, 6, 9, 10, 1);
        ExecutorService executorService= Executors.newFixedThreadPool(6);
        Sorter sorter=new Sorter(arrayToSort,executorService);
        Future<List<Integer>> resultList=executorService.submit(sorter);
        List<Integer> result=resultList.get();
        System.out.println(result);

    }
}
