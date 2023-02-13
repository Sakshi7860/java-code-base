package DesignPatterns.CreationalDesignPatterns.Factory.Client;

import DesignPatterns.CreationalDesignPatterns.Factory.AbstractFactory.UIFactory;
import DesignPatterns.CreationalDesignPatterns.Factory.Buttons.Button;
import DesignPatterns.CreationalDesignPatterns.Factory.Flutter;
import DesignPatterns.CreationalDesignPatterns.Factory.enumConstants.SupportedPlatforms;

public class Client {
    public static void main(String[] args) {
        Flutter flutter=new Flutter();
        UIFactory uiFactory=flutter.createUIFactory(SupportedPlatforms.ANDROID);
        Button button=uiFactory.createButton();
        button.resizeButton();
    }
}
