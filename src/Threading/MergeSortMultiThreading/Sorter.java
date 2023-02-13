package Threading.MergeSortMultiThreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class Sorter implements Callable<List<Integer>> {
    List<Integer> arrayToSort;
    ExecutorService service;
    Sorter(List<Integer> arrayToSort, ExecutorService service)
    {
        this.arrayToSort=arrayToSort;
        this.service=service;
    }
    public List<Integer> call() throws ExecutionException, InterruptedException {
        int n=arrayToSort.size();
        if(n<=1)
            return arrayToSort;
        int mid=n/2;
        List<Integer> leftArray=new ArrayList<>();
        List<Integer> rightArray=new ArrayList<>();
        for(int i=0;i<mid;i++)
        {
            leftArray.add(arrayToSort.get(i));
        }
        for(int i=mid;i<n;i++)
        {
            rightArray.add(arrayToSort.get(i));
        }
        Future<List<Integer>> leftArraySorted=service.submit(new Sorter(leftArray,service));
        Future<List<Integer>> rightArraySorted=service.submit(new Sorter(rightArray,service));
        List<Integer> sortedLeft=leftArraySorted.get();
        List<Integer> sortedRight=rightArraySorted.get();
        List<Integer> resultList=new ArrayList<>();
        int i=0;
        int j=0;
        while(i<sortedLeft.size() &&  j<sortedRight.size())
        {
            if(sortedLeft.get(i)<sortedRight.get(j)) {
                resultList.add(sortedLeft.get(i));
                i++;
            }
            else {
                resultList.add(sortedRight.get(j));
                j++;
            }
        }
        while(i<sortedLeft.size())
        {
            resultList.add(sortedLeft.get(i));
            i++;
        }
        while(j<sortedRight.size())
        {
            resultList.add(sortedRight.get(j));
            j++;
        }

        return resultList;
    }
}
