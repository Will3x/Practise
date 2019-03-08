package DesignPattern.Strategy.Duck;

public interface Diet {

    String diet();

}

class NoDiet implements Diet{

    @Override
    public String diet() {
        return "This duck has no diet!";
    }
}

class PlantDiet implements Diet{
    @Override
    public String diet() {
        return"Eats lots of water plants.";
    }
}