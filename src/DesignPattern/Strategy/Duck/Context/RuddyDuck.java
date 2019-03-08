package DesignPattern.Strategy.Duck.Context;

import DesignPattern.Strategy.Duck.Behaviour.Diet.PlantDiet;
import DesignPattern.Strategy.Duck.Behaviour.Flyable.FlyWithWings;
import DesignPattern.Strategy.Duck.Behaviour.Quackable.Quack;

public class RuddyDuck extends Duck {
    RuddyDuck() {
        super(new Quack(), new FlyWithWings(), new PlantDiet());
    }

    @Override
    public String getDisplay() {
        return "A beautiful duck with a blue beak.";
    }

    @Override
    public String getName() {
        return "Ruddy Duck";
    }

}
