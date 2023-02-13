package DesignPatterns.CreationalDesignPatterns.Factory.Buttons;

public class AndroidButton implements Button {
    @Override
    public void resizeButton() {
        System.out.println("resize Android Button");
    }
}
