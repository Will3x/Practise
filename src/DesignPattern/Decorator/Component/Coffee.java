package DesignPattern.Decorator.Component;

public class Coffee implements Beverage{

    @Override
    public float cost() {
        return 1.00f;
    }

    @Override
    public String description() {
        return "Coffee";
    }


}
