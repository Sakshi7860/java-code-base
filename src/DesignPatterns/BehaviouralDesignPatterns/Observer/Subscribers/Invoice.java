package DesignPatterns.BehaviouralDesignPatterns.Observer.Subscribers;

import DesignPatterns.BehaviouralDesignPatterns.Observer.Publisher.FlipkartPublisher;

public class Invoice implements Subscriber{

    public Invoice()
    {
        FlipkartPublisher publisher= FlipkartPublisher.getInstance();
        publisher.register(this);
    }
    @Override
    public void announce() {
        System.out.println("Generating Invoice");
    }
}
