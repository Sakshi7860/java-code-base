package DesignPatterns.BehaviouralDesignPatterns.Strategy;

public class WalkPathCalculatorStrategy implements PathCalculatorStrategy{
    @Override
    public void findPath(String from, String to) {
        System.out.println("Walk path");
    }
}
