package DesignPatterns.CreationalDesignPatterns.Prototype;

public class Student implements PrototypeClass {
    private int id;
    private String name;
    private int age;
    private String batchName;

    public String getAveragePSP() {
        return averagePSP;
    }

    public Student() {

    }

    public void setAveragePSP(String averagePSP) {
        this.averagePSP = averagePSP;
    }

    String averagePSP;

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

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", batchName='" + batchName + '\'' +
                ", averagePSP='" + averagePSP + '\'' +
                '}';
    }

    public Student(Student s) {
        this.id = s.id;
        this.name = s.name;
        this.age = s.age;
        this.averagePSP = s.averagePSP;
        this.batchName = s.batchName;
    }

    @Override
    public Object clone() {
      /*  Student student1=new Student();
        student1.averagePSP=this.averagePSP;
        student1.batchName=this.batchName;
        return student1;*/
        return new Student(this);
    }
}
