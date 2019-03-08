package DesignPattern.Strategy.Duck.Behaviour.Diet;

public class PlantDiet implements Diet{
    @Override
    public String diet() {
        return"Eats lots of water plants.";
    }
}
