package MapSortingBasedOnValues;

import java.util.*;

public class SortedbasedOnValuesMap {

    public static void main(String str[])
    {
        Map<String,Integer> map=new HashMap<>();
        map.put("1",107);
        map.put("2",103);
        map.put("3",101);
        map.put("4",105);
        PriorityQueue<Pair> queue=new PriorityQueue<>();
        Set<Map.Entry<String,Integer>> entrySet=map.entrySet();
        for(Map.Entry<String,Integer> set:entrySet)
        {
            queue.add(new Pair(set.getValue(),set.getKey()));
        }
        LinkedHashMap<String,Integer> linkedMap=new LinkedHashMap<>();
        while(!queue.isEmpty())
        {
            Pair p=queue.poll();
            linkedMap.put(p.key,p.value);
        }
        System.out.println("Map Values: "+linkedMap);



    }
}
