package Threading.ProducerConsumerUsingList;

import java.util.ArrayList;
import java.util.List;

class Factory
{
    public static List<Integer> list=new ArrayList<>();
    int capacity=5;
    public synchronized void produce(int val) throws InterruptedException {
        if(list.size()==capacity)
            wait();
        list.add(val);
        System.out.println("Produce: "+val);
        notify();

    }
    public synchronized void consume() throws InterruptedException {
        if(list.size()==0)
            wait();
        int value=list.remove(0);
        System.out.println("consume: "+value);
        notify();

    }
}

class Producer extends Thread
{
    Factory factory;
    Producer(Factory factory)
    {
        this.factory=factory;
    }
    public void run()
    {
        try {
            for(int i=1;i<=10;i++)
                factory.produce(i);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class Consumer extends Thread
{
    Factory factory;
    Consumer(Factory factory)
    {
        this.factory=factory;
    }
    public void run()
    {
        for(int i=1;i<=10;i++) {
            try {
                factory.consume();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class Shared {
    public static void main(String s[])
    {
        Factory factory=new Factory();
        Producer producer=new Producer(factory);
        Consumer consumer=new Consumer(factory);
        producer.start();
        consumer.start();
    }
}
