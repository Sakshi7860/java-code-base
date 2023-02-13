package MapSortingBasedOnValues;

import java.util.*;
import java.util.stream.Collectors;

public class SortingBasedOnValueUsingList {
    public static void main(String str[])
    {
        Map<String,Integer> map=new HashMap<>();
        map.put("1",107);
        map.put("2",103);
        map.put("3",101);
        map.put("4",105);
        List<Map.Entry<String,Integer>> list=new ArrayList<>(map.entrySet());
        Map<String,Integer> map1=map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(e-> e.getKey(),e->e.getValue()));
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        LinkedHashMap<String,Integer> linkedHashMap=new LinkedHashMap<>();
        for(Map.Entry<String,Integer> set:list)
        {
            linkedHashMap.put(set.getKey(),set.getValue());
        }
        System.out.println(linkedHashMap);
    }
}
