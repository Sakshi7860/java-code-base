package cloneable.SingleClassClone;

public class StudentDemo {
    public static void main(String s[]) throws CloneNotSupportedException {
        Student student=new Student();
        student.setId(101);
        student.setName("Sakshi");
        student.setAge(25);
        Student student1= (Student) student.clone();
        System.out.println(student.hashCode()+" "+student);
        System.out.println(student1.hashCode()+" "+student1);
    }
}
