package DesignPatterns.StructualDesignPatterns.Decorator.Basic;

public class OrangeCone implements IceCreamConeConstitute {
    @Override
    public int getCost() {
        return 10;
    }

    @Override
    public String getDescription() {
        return "Orange Cone";
    }
}
