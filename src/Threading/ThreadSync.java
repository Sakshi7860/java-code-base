package Threading;

class Table
{
    public synchronized void printTable(int n)
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println("table of n:"+" "+n+" "+n*i);
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
        Table table = new Table();
        Thread1 th1 = new Thread1(table);
        Thread2 th2 = new Thread2(table);
        th1.start();
        th2.start();
    }
}
