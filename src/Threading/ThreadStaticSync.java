package Threading;
class Table1
{
    public static synchronized void printTable(int n)
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
class ThreadFirst extends Thread
{
    Table t;
    ThreadFirst(Table t)
    {
        this.t=t;
    }
    public void run()
    {
        System.out.println("Running Thread First");
        //Table1.printTable(2);
        t.printTable(5);
        try {
            t.print("first: "+Thread.currentThread().getName());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class ThreadSecond extends Thread
{
    Table t;
    ThreadSecond(Table t)
    {
        this.t=t;
    }
    public void run()
    {
        System.out.println("Running Thread Second");
        t.printTable(3);
        try {
            t.print("Second: "+Thread.currentThread().getName());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
public class ThreadStaticSync {
    public static void main(String s[]) {
        Table t=new Table();
        ThreadFirst th1 = new ThreadFirst(t);
        ThreadSecond th2 = new ThreadSecond(t);
        th1.start();
        th2.start();
    }
}
