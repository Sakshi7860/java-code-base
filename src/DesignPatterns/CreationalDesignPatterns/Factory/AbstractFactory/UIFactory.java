package DesignPatterns.CreationalDesignPatterns.Factory.AbstractFactory;

import DesignPatterns.CreationalDesignPatterns.Factory.Buttons.Button;
import DesignPatterns.CreationalDesignPatterns.Factory.Menus.Menu;

public interface UIFactory {
    public Button createButton();
    public Menu createMenu();
}
