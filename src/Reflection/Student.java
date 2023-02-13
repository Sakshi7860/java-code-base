package Reflection;

public class Student {
    private int id;
    int age;
    private String name="Sakshi";

      Student()
    {

    }

    public void show(String name)
    {
        System.out.println("name is: "+name);
    }


    public int getId() {
        return id;
    }

    public Student(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
