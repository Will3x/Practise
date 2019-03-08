package DesignPattern.Strategy.Duck.Behaviour.Quackable;

public class MuteQuack implements Quackable {
    @Override
    public String quack() {
        return "Can't quack :(";
    }
}
