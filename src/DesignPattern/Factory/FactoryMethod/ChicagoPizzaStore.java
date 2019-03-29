package DesignPattern.Factory.FactoryMethod;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String pizza) {
        switch (pizza){
            case "CheesePizza":
                return new ChicagoStyleCheesePizza();
            default:
                return new NYCheesePizza();
        }
    }
}
