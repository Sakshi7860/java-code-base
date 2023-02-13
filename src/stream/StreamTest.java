package stream;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTest {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Sakshi","abc");
        list.stream().map(x-> x.toUpperCase()).forEach(x-> System.out.println(x));

        List<Integer> list2=Arrays.asList(2,7,1,5,0);
        Optional<Integer> minVal=list2.stream().max((x, y)-> x.compareTo(y));
        System.out.println(minVal.get());

        Optional<Integer> ans=list2.stream().reduce((a,b)-> a+b);
        System.out.println(ans.get());

        List<Integer> result=list2.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        //List<Integer> result=list2.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());

        System.out.println(result);

        //boolean val=list.stream().anyMatch(x-> x.endsWith("i"));
        //boolean val=list.stream().allMatch(x-> x.endsWith("i"));
        boolean val=list.stream().noneMatch(x-> x.startsWith("a"));
        System.out.println(val);


        List<String> stringList=Arrays.asList("One","Frange","Fhree");
        Optional<String> res=stringList.stream().filter(x-> x.startsWith("v")).findFirst();
        System.out.println(res);


        Map<Integer, String> hmap = new HashMap<Integer, String>();
        hmap.put(11, "Apple");
        hmap.put(22, "Orange");
        hmap.put(33, "Kiwi");
        hmap.put(44, "Banana");
        Set<Map.Entry<Integer,String>> set =hmap.entrySet();
        for(Map.Entry<Integer,String> entry:set)
        {
            System.out.println(entry.getKey()+": "+entry.getValue());
        }
        //sort map by values
        hmap.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(x-> System.out.println(x));

        //sort map by keys
        hmap.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(x-> System.out.println(x));

        //Map<Integer,String> answer=hmap.entrySet().stream().filter(x-> x.getKey()<=20).collect(Collectors.toMap(x->x.getKey(),x->x.getValue()));
        //System.out.println(answer);
        Set<Integer> setArray=new HashSet<>();
        setArray.add(20);
        setArray.add(10);
        setArray.add(15);
        System.out.println(setArray.stream().filter(x-> x>15).count());
    }
}
