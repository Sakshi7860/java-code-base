package cloneable;

public class Main {
    public static void main(String args[]) throws CloneNotSupportedException {
        System.out.println("Cloneable example 1");
        Department department=new Department(101,"CSE");
        Student student=new Student(1,"Sakshi",department);
        Student student1=(Student) student.clone();
        student.getDepartment().setName("ece");
        System.out.println(student);
        System.out.println(student1);

    }
}
