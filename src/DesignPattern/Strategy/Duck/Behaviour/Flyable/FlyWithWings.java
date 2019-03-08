package DesignPattern.Strategy.Duck.Behaviour.Flyable;

public class FlyWithWings implements Flyable {
    @Override
    public String fly() {
        return "Using its wings to fly high";
    }
}
