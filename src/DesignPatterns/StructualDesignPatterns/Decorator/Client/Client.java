package DesignPatterns.StructualDesignPatterns.Decorator.Client;

import DesignPatterns.StructualDesignPatterns.Decorator.AddOn.ChocoChips;
import DesignPatterns.StructualDesignPatterns.Decorator.AddOn.VanillaScoop;
import DesignPatterns.StructualDesignPatterns.Decorator.Basic.ChocolateCone;
import DesignPatterns.StructualDesignPatterns.Decorator.Basic.IceCreamConeConstitute;

public class Client {
    public static void main(String[] args) {
        IceCreamConeConstitute iceCreamConeConstitute=
                new VanillaScoop(
                    new ChocoChips(
                         new ChocolateCone()
                ));
        System.out.println(iceCreamConeConstitute.getCost());
        System.out.println(iceCreamConeConstitute.getDescription());
    }
}
