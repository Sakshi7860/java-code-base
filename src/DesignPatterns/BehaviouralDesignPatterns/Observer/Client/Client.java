package DesignPatterns.BehaviouralDesignPatterns.Observer.Client;

import DesignPatterns.BehaviouralDesignPatterns.Observer.Publisher.FlipkartPublisher;
import DesignPatterns.BehaviouralDesignPatterns.Observer.Subscribers.EmailSender;
import DesignPatterns.BehaviouralDesignPatterns.Observer.Subscribers.Invoice;

public class Client {
    public static void main(String[] args) {
        FlipkartPublisher flipkartPublisher=FlipkartPublisher.getInstance();
        EmailSender emailSender=new EmailSender();
        Invoice invoice=new Invoice();
        flipkartPublisher.orderPlaced();
    }
}
