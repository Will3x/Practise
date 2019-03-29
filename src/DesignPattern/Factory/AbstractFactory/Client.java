package DesignPattern.Factory.AbstractFactory;

public class Client {

    public static void main(String[] args){
        PizzaStore nyPizzaStore = new NYPizzaStore();
        nyPizzaStore.orderPizza("cheese");
    }
}
