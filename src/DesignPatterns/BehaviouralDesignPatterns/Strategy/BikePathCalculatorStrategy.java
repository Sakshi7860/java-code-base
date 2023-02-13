package DesignPatterns.BehaviouralDesignPatterns.Strategy;

public class BikePathCalculatorStrategy implements PathCalculatorStrategy{
    @Override
    public void findPath(String from, String to) {
        System.out.println("Bike Path");
    }
}
