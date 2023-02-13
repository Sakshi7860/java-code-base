package DesignPatterns.BehaviouralDesignPatterns.Observer.Publisher;

import DesignPatterns.BehaviouralDesignPatterns.Observer.Subscribers.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class FlipkartPublisher {
    private static FlipkartPublisher instance;
    List<Subscriber> list=new ArrayList<>();

    public static FlipkartPublisher getInstance()
    {
        if(instance==null)
            instance=new FlipkartPublisher();
        return instance;

    }
    public void register(Subscriber s)
    {
        list.add(s);
    }
    public void unregister(Subscriber s){
        list.remove(s);
    }
    public void orderPlaced()
    {
        for(Subscriber s:list)
            s.announce();
    }
}
