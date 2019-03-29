package DesignPattern.State;

public class Fanta implements Beverage {

    @Override
    public String description() {
        return null;
    }

    @Override
    public String getName(){
        return "Fanta";
    }

    @Override
    public float price() {
        return 1.50f;
    }
}
