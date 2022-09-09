package test;

public class ThreadClass extends Thread{
    public void run()
    {
        System.out.println("Thread started");
    }
    public static void main(String s[])
    {
        ThreadClass threadClass=new ThreadClass();
        threadClass.start();
        threadClass.start();
    }
}
