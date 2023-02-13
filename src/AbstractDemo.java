import java.util.ArrayList;
import java.util.TreeSet;
abstract class myClass
{
     static final int i=10;
     myClass()
     {
        System.out.println("my class");
    }

    abstract void print();
}
class Child extends  myClass
{

    public void print()
    {
        System.out.println("child class");
    }
}
public class AbstractDemo {
    public static void main(String s[])
    {
        myClass c=new Child();
        c.print();
    }
}
