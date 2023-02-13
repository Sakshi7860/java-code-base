import java.util.*;
import java.util.concurrent.CopyOnWriteArraySet;

public class Library {
    public static void main(String args[])
    {
        Set<Integer> set=new HashSet<>();
        set.add(2);
        set.add(1);
        set.add(3);
        Iterator iterator=set.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
            iterator.remove();
        }
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"E1");
        map.put(2,"E2");
        Iterator<Map.Entry<Integer,String>> mapIterator=map.entrySet().iterator();
        while(mapIterator.hasNext())
        {
            Map.Entry<Integer,String> entrySet=mapIterator.next();
            System.out.println(entrySet.getKey()+": "+entrySet.getValue());
        }

    }
}
