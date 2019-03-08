package DesignPattern.Strategy.Duck.Context;

import DesignPattern.Strategy.Duck.Behaviour.Diet.PlantDiet;
import DesignPattern.Strategy.Duck.Behaviour.Flyable.FlyWithWings;
import DesignPattern.Strategy.Duck.Behaviour.Quackable.Quack;

public class Mallard extends Duck {
    Mallard() {
        super("Mallard", new Quack(), new FlyWithWings(), new PlantDiet());
    }

    @Override
    public String getDisplay() {
        return "Majestic duck";
    }

}
