package DesignPatterns.CreationalDesignPatterns.Factory.AbstractFactory;

import DesignPatterns.CreationalDesignPatterns.Factory.Buttons.AndroidButton;
import DesignPatterns.CreationalDesignPatterns.Factory.Menus.Menu;

public class AndriodUIFactory implements UIFactory {

    @Override
    public AndroidButton createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return null;
    }
}
