package DesignPattern.Strategy.Duck.Context;

import DesignPattern.Strategy.Duck.Behaviour.Diet.NoDiet;
import DesignPattern.Strategy.Duck.Behaviour.Flyable.NoFly;
import DesignPattern.Strategy.Duck.Behaviour.Quackable.Squeak;

public class RubberDuck extends Duck {

    RubberDuck() {
        super(new Squeak(), new NoFly(), new NoDiet());
    }

    @Override
    public String getDisplay() {
        return "A yellow duckling.";
    }

    @Override
    public String getName() {
        return "Rubber Duck";
    }
}
