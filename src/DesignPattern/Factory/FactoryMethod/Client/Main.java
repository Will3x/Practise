package DesignPattern.Factory.FactoryMethod.Client;

import DesignPattern.Factory.FactoryMethod.NYPizzaStore;
import DesignPattern.Factory.FactoryMethod.Pizza;
import DesignPattern.Factory.FactoryMethod.PizzaStore;

public class Main {

    public static void main(String[] args){
        PizzaStore NYStore = new NYPizzaStore();

        Pizza NYCheesePizza = NYStore.orderPizza("CheesePizza");


    }
}
