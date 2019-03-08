package DesignPattern.Strategy.Duck.Context;

import DesignPattern.Strategy.Duck.Behaviour.Diet.NoDiet;
import DesignPattern.Strategy.Duck.Behaviour.Flyable.NoFly;
import DesignPattern.Strategy.Duck.Behaviour.Quackable.MuteQuack;

public class DecoyDuck extends Duck {
    DecoyDuck() {
        super("Decoy duck", new MuteQuack(), new NoFly(), new NoDiet());
    }

    @Override
    public String getDisplay() {
        return "A wooden decoy duck.";
    }

}
