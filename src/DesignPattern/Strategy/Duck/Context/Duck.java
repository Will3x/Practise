package DesignPattern.Strategy.Duck.Context;

import DesignPattern.Strategy.Duck.Behaviour.Diet.Diet;
import DesignPattern.Strategy.Duck.Behaviour.Flyable.Flyable;
import DesignPattern.Strategy.Duck.Behaviour.Quackable.Quackable;

public abstract class Duck {

    private Quackable quackable;
    private Flyable flyable;
    private Diet diet;

    Duck(Quackable quackable, Flyable flyable, Diet diet) {
        this.quackable = quackable;
        this.flyable = flyable;
        this.diet = diet;
    }

    public abstract String getDisplay();
    public abstract String getName();

    public String swim() {
        return "Swimming..";
    }

    public String fly() {
        return flyable.fly();
    }

    public String quack() {
        return quackable.quack();
    }

    public String diet() {
        return diet.diet();
    }
}

