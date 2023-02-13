package DesignPatterns.CreationalDesignPatterns.Factory.Buttons;

public class WindowsButton implements Button{
    @Override
    public void resizeButton() {
        System.out.println("resize Windows Button");
    }
}
