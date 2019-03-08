package DesignPattern.Strategy.Duck.Behaviour.Diet;

public class NoDiet implements Diet{

    @Override
    public String diet() {
        return "This duck has no diet!";
    }
}
