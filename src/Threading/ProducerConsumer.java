package Threading;
class Shared
{
    boolean flag=true;
    private int data;
    public synchronized void produce(int n) throws InterruptedException {
        if(!flag)
            wait();
        this.data=n;
        System.out.println("produce: "+this.data);
        flag=false;
        notify();
    }
    public synchronized int consume() throws InterruptedException {
        if(flag)
            wait();
        System.out.println("consume: "+data);
        flag=true;
        notify();
        return data;
    }
}
class Producer extends Thread
{
    Shared shared;
    Producer(Shared shared)
    {
        this.shared=shared;
    }
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            try {
                shared.produce(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class Consumer extends Thread{
    Shared shared;
    Consumer(Shared shared){
        this.shared=shared;
    }
    public void run(){
        for(int i=1;i<=10;i++) {
            try {
                shared.consume();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

}
public class ProducerConsumer {
    public static void main(String s[])
    {
        Shared sh=new Shared();
        Producer p=new Producer(sh);
        Consumer c=new Consumer(sh);
        p.start();
        c.start();
    }
}
