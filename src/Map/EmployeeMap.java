package Map;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

class Employee
{
    int id;
    String name;
    Integer age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && age == employee.age && name.equals(employee.name);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("hash: "+Objects.hash(id,name,age));
        return Objects.hash(id, name, age);
    }
}
public class EmployeeMap {
    public static void main(String str[])
    {
        Map<Employee,Integer> map=new HashMap<>();
        Employee employee=new Employee(1,"abc",20);
        //Employee employee1=new Employee(2,"xyz",22);
        Employee employee2=new Employee(3,"rst",26);
        Employee employee3=new Employee(3,"rst",26);
        //map.put(employee,1);
        map.put(employee2,2);
        map.put(employee3,3);
        System.out.println(map);
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.remove(new Integer(20));
        System.out.println(list);


    }
}
