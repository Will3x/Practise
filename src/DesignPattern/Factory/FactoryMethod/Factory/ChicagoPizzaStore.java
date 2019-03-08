package DesignPattern.Factory.FactoryMethod.Factory;

import DesignPattern.Factory.FactoryMethod.Product.ChicagoStyleCheesePizza;
import DesignPattern.Factory.FactoryMethod.Product.NYCheesePizza;
import DesignPattern.Factory.FactoryMethod.Product.Pizza;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String pizza) {
        switch (pizza){
            case "CheesePizza":
                return new ChicagoStyleCheesePizza();
            default:
                return new NYCheesePizza();
        }
    }
}
