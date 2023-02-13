package MapSortingBasedOnValues;

import java.util.*;

public class SortedBasedOnValuesCustomClass {
    public static void main(String str[]) {
        Map<Employee, Integer> map = new HashMap<>();
        map.put(new Employee(1, "sakshi"), 107);
        map.put(new Employee(2, "minku"), 103);
        map.put(new Employee(3, "Ram"), 101);
        PriorityQueue<EmployeePair> queue = new PriorityQueue<>();
        Set<Map.Entry<Employee, Integer>> entrySet = map.entrySet();
        for (Map.Entry<Employee, Integer> set : entrySet) {
            queue.add(new EmployeePair(set.getKey(), set.getValue()));
        }
        LinkedHashMap<Employee, Integer> linkedMap = new LinkedHashMap<>();
        while (!queue.isEmpty()) {
            EmployeePair p = queue.poll();
            linkedMap.put(p.employee, p.value);
        }
        System.out.println("Map Values: " + linkedMap);
    }
}
