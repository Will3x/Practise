package DesignPattern.Factory.FactoryMethod;

import DesignPattern.Factory.FactoryMethod.Factory.ChicagoPizzaStore;
import DesignPattern.Factory.FactoryMethod.Factory.NYPizzaStore;
import DesignPattern.Factory.FactoryMethod.Factory.PizzaStore;
import DesignPattern.Factory.FactoryMethod.Product.Pizza;

public class Main {

    public static void main(String[] args){
        PizzaStore NYStore = new NYPizzaStore();
        PizzaStore ChicagoStore = new ChicagoPizzaStore();

        Pizza NYCheesePizza = NYStore.createPizza("CheesePizza");
        Pizza ChicagoCheesePizza = ChicagoStore.createPizza("CheesePizza");

    }
}
