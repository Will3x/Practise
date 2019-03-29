package DesignPattern.State;

public class Coke implements Beverage {

    @Override
    public String description() {
        return null;
    }

    @Override
    public String getName(){
        return "Coca Cola";
    }

    @Override
    public float price() {
        return 2.00f;
    }

}
