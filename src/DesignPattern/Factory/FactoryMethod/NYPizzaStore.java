package DesignPattern.Factory.FactoryMethod;

public class NYPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String pizza) {
        switch (pizza){
            case "CheesePizza":
                return new NYCheesePizza();
            default:
                return new NYCheesePizza();
        }
    }
}
