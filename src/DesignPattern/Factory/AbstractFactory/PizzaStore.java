package DesignPattern.Factory.AbstractFactory;

public abstract class PizzaStore {

    public Pizza orderPizza(String type){
        Pizza pizza = createPizza(type);

        pizza.bake();
        pizza.cut();
        pizza.box();
        System.out.println("Enjoy your " + pizza.getName() + "!");

        return pizza;
    }

    abstract Pizza createPizza(String pizza);

}
