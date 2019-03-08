package DesignPattern.Strategy.Duck;

public interface Quackable {

    String quack();
}

class Quack implements Quackable {
    @Override
    public String quack() {
        return "Quack!";
    }
}

class Squeak implements Quackable {
    @Override
    public String quack() {
        return "Squeak!";
    }
}

class MuteQuack implements Quackable {
    @Override
    public String quack() {
        return "Can't quack :(";
    }
}
