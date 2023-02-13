package DesignPatterns.BehaviouralDesignPatterns.Strategy;

public class GoogleMaps {
    public void findPaths(String from, String to, String mode)
    {
        /*if(mode == ...)
        {

        }else if(mode== ...)
        {

        } -> violates SRP, OCP */
        PathCalculatorStrategy pathCalculatorStrategy=PathCalculatorStrategyFactory.getPathCalculatorStrategyBasedOnMode(mode);
        pathCalculatorStrategy.findPath(from,to);
    }
}
