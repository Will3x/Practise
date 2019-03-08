package DesignPattern.Strategy.Duck;

public interface Flyable {

    String fly();
}

class FlyWithWings implements Flyable {
    @Override
    public String fly() {
        return "Using its wings to fly high";
    }
}

class NoFly implements Flyable {
    @Override
    public String fly() {
        return "Can't fly!";
    }
}

