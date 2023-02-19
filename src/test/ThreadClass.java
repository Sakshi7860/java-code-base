package test;

import java.util.Arrays;

public class ThreadClass extends Thread{
    public void run()
    {
        System.out.println("Thread started");
    }
    public static void main(String s[])
    {
        System.out.println("main class");
        ThreadClass threadClass=new ThreadClass();
        threadClass.start();
        //threadClass.start();  //illegalThreadStateException

    }
}
