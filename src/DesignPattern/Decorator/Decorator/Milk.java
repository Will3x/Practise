package DesignPattern.Decorator.Decorator;

import DesignPattern.Decorator.Component.Beverage;

public class Milk extends CondimentDecorator {

    private Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public float cost() {
        return beverage.cost() + .30f;
    }

    @Override
    public String description() {
        return beverage.description() + ", milk";
    }
}
