package DesignPatterns.StructualDesignPatterns.Decorator.AddOn;

import DesignPatterns.StructualDesignPatterns.Decorator.Basic.IceCreamConeConstitute;

public class ChocoChips implements IceCreamConeConstitute {
    private IceCreamConeConstitute iceCreamConeConstitute;
    public ChocoChips(IceCreamConeConstitute iceCreamConeConstitute)
    {
        this.iceCreamConeConstitute=iceCreamConeConstitute;
    }
    @Override
    public int getCost() {
        System.out.println("Choco Chips");
        return iceCreamConeConstitute.getCost()+10;
    }

    @Override
    public String getDescription() {
        return iceCreamConeConstitute.getDescription()+" Choco Chips";
    }
}
