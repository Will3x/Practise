package DesignPattern.Strategy.Duck.Behaviour.Quackable;

public class Squeak implements Quackable {
    @Override
    public String quack() {
        return "Squeak!";
    }
}
