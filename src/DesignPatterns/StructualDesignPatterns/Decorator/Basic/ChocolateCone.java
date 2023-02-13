package DesignPatterns.StructualDesignPatterns.Decorator.Basic;

public class ChocolateCone implements IceCreamConeConstitute {
    @Override
    public int getCost() {
        System.out.println("chocolate cone");
        return 10;
    }

    @Override
    public String getDescription() {
        return "Chocolate Cone";
    }
}
