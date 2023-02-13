package DesignPatterns.CreationalDesignPatterns.Factory;

import DesignPatterns.CreationalDesignPatterns.Factory.AbstractFactory.UIFactory;
import DesignPatterns.CreationalDesignPatterns.Factory.Factory.UIFactoryFactory;
import DesignPatterns.CreationalDesignPatterns.Factory.enumConstants.SupportedPlatforms;

public class Flutter {
    public void showTheme()
    {
        System.out.println("show theme");
    }
    public UIFactory createUIFactory(SupportedPlatforms platforms)
    {
        return UIFactoryFactory.getFactoryByName(SupportedPlatforms.ANDROID);
    }
}
