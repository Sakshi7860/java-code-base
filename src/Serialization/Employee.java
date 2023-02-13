package Serialization;

import java.io.Serializable;

public class Employee implements Serializable {

    private final static long serialVersionUID=101L;
    int id;
    String name;
    String dept;

    int age;

    public Employee()
    {
        System.out.println("Default constructor");
    }
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                '}';
    }

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

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Employee(int id, String name, String dept) {
        System.out.println("Parameterized");
        this.id = id;
        this.name = name;
        this.dept = dept;
    }
}
