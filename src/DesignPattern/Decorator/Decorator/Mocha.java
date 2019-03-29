package DesignPattern.Decorator.Decorator;

import DesignPattern.Decorator.Component.Beverage;

public class Mocha extends CondimentDecorator{

    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public float cost() {
        return beverage.cost() + .50f;
    }

    @Override
    public String description() {
        return beverage.description() + ", mocha";
    }
}
