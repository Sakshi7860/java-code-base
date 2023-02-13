package DesignPatterns.StructualDesignPatterns.Decorator.AddOn;

import DesignPatterns.StructualDesignPatterns.Decorator.Basic.IceCreamConeConstitute;

public class VanillaScoop implements IceCreamConeConstitute {

    IceCreamConeConstitute iceCreamConeConstitute;
    public VanillaScoop(IceCreamConeConstitute iceCreamConeConstitute)
    {
        this.iceCreamConeConstitute=iceCreamConeConstitute;
    }

    @Override
    public int getCost() {
        System.out.println("vanilla");
        return iceCreamConeConstitute.getCost() + 10;
    }

    @Override
    public String getDescription() {
        return iceCreamConeConstitute.getDescription() + " Vanilla Scoop";
    }
}
