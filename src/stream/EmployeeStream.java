package stream;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeStream {
    public static void main(String s[])
    {
        List<Employee> list=new ArrayList<>();
        list.add(new Employee(1,"Ram",32,"M","HR",2011,25000));
        list.add(new Employee(2,"Sham",22,"M","Sales",2015,21000));
        list.add(new Employee(3,"Jiya",27,"F","Sales",2012,28000));
        list.add(new Employee(4,"Nina",30,"F","HR",2011,35000));
        list.add(new Employee(5,"manu",21,"M","product",2015,30000));
        //get Avergae salary of each dept

        Map<String,Double> map=list.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.averagingDouble(Employee::getSalary)));
        //System.out.println(map);
        //details of youngest male employee
        Optional<Employee> val=list.stream().filter(x-> x.getGender().equals("M")).min(Comparator.comparingInt(Employee::getAge));
        //System.out.println(val.get());
        //most working exp
        Optional<Employee> result=list.stream().sorted(Comparator.comparingInt(Employee::getYear)).findFirst();
        //System.out.println(result.get());
        //list name of employee in each dept
        Map<String,List<Employee>> map2=list.stream().collect(Collectors.groupingBy(Employee::getDept));
        //System.out.println(map2);
        DoubleSummaryStatistics statistics=list.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.println(statistics.getAverage());
        System.out.println(statistics.getSum());

        //oldest employee
        Optional<Employee> employee=list.stream().max(Comparator.comparingInt(Employee::getAge));
        System.out.println(employee.get().getDept());




    }
}
