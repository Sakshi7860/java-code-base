package DesignPatterns.CreationalDesignPatterns.Factory.AbstractFactory;

import DesignPatterns.CreationalDesignPatterns.Factory.Buttons.WindowsButton;
import DesignPatterns.CreationalDesignPatterns.Factory.Menus.Menu;

public class WindowsUIFactory implements UIFactory {

    @Override
    public WindowsButton createButton() { //return type here can be of interface or child class also. i.e Button/AndroidButton/WindowsButton
        return new WindowsButton();
    }

    @Override
    public Menu createMenu() {
        return null;
    }
}
