package DiamondProblem;

import java.util.Comparator;
import java.util.PriorityQueue;

interface A
{
    default public void show()
    {
        System.out.println("show");
    }
}

interface  B
{
    default public void show()
    {
        System.out.println("show B");
    }
}

class C implements A,B{

    @Override
    public void show() {
        System.out.println("C");
    }
}
class D extends C implements B{

}

public class Test {
    public static void main(String[] args) {
        C c=new C();
        //c.show();
        D d=new D();
        d.show();


    }
}
