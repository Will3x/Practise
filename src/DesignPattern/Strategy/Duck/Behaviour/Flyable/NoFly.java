package DesignPattern.Strategy.Duck.Behaviour.Flyable;

public class NoFly implements Flyable {
    @Override
    public String fly() {
        return "Can't fly!";
    }
}
