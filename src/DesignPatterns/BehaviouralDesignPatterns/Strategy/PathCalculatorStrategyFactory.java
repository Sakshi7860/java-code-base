package DesignPatterns.BehaviouralDesignPatterns.Strategy;

public class PathCalculatorStrategyFactory {
    public static PathCalculatorStrategy getPathCalculatorStrategyBasedOnMode(String mode)
    {
        if(mode.equals("Walk"))
            return new WalkPathCalculatorStrategy();
        else if(mode.endsWith("Car"))
            return new CarPathCalculatorStrategy();
        else
            return new BikePathCalculatorStrategy();
    }
}
