package DesignPattern.Factory.FactoryMethod.Factory;

import DesignPattern.Factory.FactoryMethod.Product.NYCheesePizza;
import DesignPattern.Factory.FactoryMethod.Product.Pizza;

public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String pizza) {
        switch (pizza){
            case "CheesePizza":
                return new NYCheesePizza();
            default:
                return new NYCheesePizza();
        }
    }
}
