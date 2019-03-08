package DesignPattern.Factory.FactoryMethod.Factory;

import DesignPattern.Factory.FactoryMethod.Product.Pizza;

public abstract class PizzaStore {

    public abstract Pizza createPizza(String pizza);

}
