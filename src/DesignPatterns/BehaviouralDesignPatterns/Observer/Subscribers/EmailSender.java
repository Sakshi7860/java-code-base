package DesignPatterns.BehaviouralDesignPatterns.Observer.Subscribers;

import DesignPatterns.BehaviouralDesignPatterns.Observer.Publisher.FlipkartPublisher;

public class EmailSender implements Subscriber{

    public EmailSender()
    {
        FlipkartPublisher publisher= FlipkartPublisher.getInstance();
        publisher.register(this);
    }
    @Override
    public void announce() {
        System.out.println("Sending Email");
    }
}
