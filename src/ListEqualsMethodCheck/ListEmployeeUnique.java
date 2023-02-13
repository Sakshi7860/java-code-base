package ListEqualsMethodCheck;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListEmployeeUnique {
    public static void main(String s[])
    {
        List<Employee> list=new ArrayList<>();
        list.add(new Employee(101,"abc"));
        list.add(new Employee(102,"efg"));
        list.add(new Employee(102,"efg"));
        list.add(new Employee(103,"ghj"));
        list=list.stream().distinct().collect(Collectors.toList()); //distinct internally call both HashCode() and equals() Methods
        //removeDuplicates(list);
        System.out.println(list);
    }

    public static void removeDuplicates(List<Employee> list){
        for(int i = 1;i<list.size();i++) {
            if (list.get(i).equals(list.get(i - 1)))
                list.remove(i);
        }
    }
}
