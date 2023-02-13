package Threading;
class Print
{
    boolean odd =true;
    int data=1;
    public synchronized void printEven() throws InterruptedException {
        if(odd)
            wait();
        System.out.println("even: "+data);
        data=data+1;
        notify();
        odd=true;

    }
    public synchronized void printOdd() throws InterruptedException {
        if(!odd)
            wait();
        System.out.println("odd: "+data);
        data=data+1;
        notify();
        odd=false;
    }
}
class PrintEven extends Thread
{
    Print print;
    PrintEven(Print p)
    {
        this.print=p;
    }
    public void run()
    {
        for(int i=1;i<=5;i++) {
            try {
                print.printEven();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class PrintOdd extends Thread
{
    Print print;
    PrintOdd(Print p)
    {
      this.print=p;
    }
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            try {
                print.printOdd();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
public class EvenOdd {
    public static void main(String str[])
    {
        Print p=new Print();
        PrintEven even=new PrintEven(p);
        PrintOdd odd=new PrintOdd(p);
        even.start();
        odd.start();
    }
}
