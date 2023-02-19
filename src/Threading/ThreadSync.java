package Threading;

import com.sun.corba.se.impl.orbutil.concurrent.Sync;
import kotlin.jvm.Synchronized;

class Table
{
    public void printTable(int n)
    {
        synchronized(Table.class)
        {
            for (int i = 1; i <= 10; i++) {
                System.out.println("table of n:" + " " + n + " " + n * i);
            }
        }
    }

    public void print(String name) throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("print name: "+name);
    }
}
class Thread1 extends Thread
{
    Table t;
    Thread1(Table t)
    {
        this.t=t;
    }
    public void run()
    {
        t.printTable(2);
        try {
            t.print(Thread.currentThread().getName());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class Thread2 extends Thread
{
    Table t;
    Thread2(Table t)
    {
        this.t=t;
    }
    public void run()
    {
       t.printTable(3);
        try {
            t.print(Thread.currentThread().getName());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
public class ThreadSync {
    public static void main(String s[]) {
        Table table1 = new Table();
        //Table table2 = new Table();
        Thread1 th1 = new Thread1(table1);
        Thread2 th2 = new Thread2(table1);
        th1.start();
        th2.start();
    }
}
