package concurrent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListConcurrent {
    public static void main(String s[])
    {
        CopyOnWriteArrayList<Integer> list=new CopyOnWriteArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        Iterator itr=list.iterator();

        while(itr.hasNext())
        {
            Integer i=(Integer) itr.next();
            System.out.println(i);
            itr.remove();

        }
        System.out.println(list);


    }
}
