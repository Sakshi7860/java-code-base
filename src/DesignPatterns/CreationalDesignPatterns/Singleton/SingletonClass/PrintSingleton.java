package DesignPatterns.CreationalDesignPatterns.Singleton.SingletonClass;

public class PrintSingleton {
    public static void main(String args[])  {
        SingletonPattern pattern=SingletonPattern.getInstance();
        SingletonPattern pattern1=SingletonPattern.getInstance();
        System.out.println(pattern);
        System.out.println(pattern1);






    }
}
