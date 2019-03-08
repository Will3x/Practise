package DesignPattern.Strategy.Duck.Behaviour.Quackable;

public class Quack implements Quackable {
    @Override
    public String quack() {
        return "Quack!";
    }
}
