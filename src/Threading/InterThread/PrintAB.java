package Threading.InterThread;

import java.util.LinkedList;

class Print
{
    boolean flag=true;
    public synchronized void printA(char ch) throws InterruptedException {
        while(true) {
            while (!flag)
                wait();
            System.out.println(ch);
            flag = !flag;
            notify();
        }

    }
    public synchronized void printB(char ch) throws InterruptedException {
        while(true) {
            while (flag)
                wait();
            System.out.println(ch);
            flag = !flag;
            notify();
        }

    }
}
class Thread1 extends Thread
{
    Print p;
    Thread1(Print p)
    {
        this.p=p;
    }
    public void run()
    {
        try {
                p.printA('A');
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class Thread2 extends Thread
{
    Print p;
    Thread2(Print p)
    {
        this.p=p;
    }
    public void run()
    {
        try {
                p.printB('B');
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
public class PrintAB {
    public static void main(String s[])
    {
        Print print=new Print();
        Thread1 th1=new Thread1(print);
        Thread2 th2=new Thread2(print);
        th1.start();
        th2.start();

    }
}
