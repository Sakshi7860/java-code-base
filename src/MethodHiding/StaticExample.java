package MethodHiding;
class A
{
    static void sum()
    {
        System.out.println("print sum A");
    }
}
class B extends A{
    static void sum()
    {
        System.out.println("print sum B");
    }
}

public class StaticExample {
    public static void main(String[] args) {
        A a=new B();
        a.sum();
    }
}
