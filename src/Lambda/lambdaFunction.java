package Lambda;

@FunctionalInterface
interface Student
{
    void print();
}
public class lambdaFunction {
    public static void main(String[] args) {
        Student s = () -> System.out.println("print");

        s.print();

    }
}
