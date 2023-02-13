package FunctionalInterface;


import java.util.Collection;
import java.util.function.Predicate;

@FunctionalInterface
interface Example
{
    default void print()
    {
        System.out.println("my interface example");
    }

    int sum(int a,int b);
}
public class InterfaceExample {
    public static void main(String[] args) {
        Example e = (a,b) -> {return a+b;};
        System.out.println(e.sum(10,20));


    }

}


