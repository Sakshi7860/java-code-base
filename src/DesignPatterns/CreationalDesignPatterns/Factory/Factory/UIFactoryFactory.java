package DesignPatterns.CreationalDesignPatterns.Factory.Factory;

import DesignPatterns.CreationalDesignPatterns.Factory.AbstractFactory.UIFactory;
import DesignPatterns.CreationalDesignPatterns.Factory.AbstractFactory.AndriodUIFactory;
import DesignPatterns.CreationalDesignPatterns.Factory.AbstractFactory.WindowsUIFactory;
import DesignPatterns.CreationalDesignPatterns.Factory.enumConstants.SupportedPlatforms;

public class UIFactoryFactory {
    public static UIFactory getFactoryByName(SupportedPlatforms platform) {
        switch (platform) {
            case ANDROID:
                return new AndriodUIFactory();
            case WINDOWS:
                return new WindowsUIFactory();
            default:
                return new AndriodUIFactory();
        }
    }
}
