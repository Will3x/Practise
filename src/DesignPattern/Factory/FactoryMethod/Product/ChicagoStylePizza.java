package DesignPattern.Factory.FactoryMethod.Product;

abstract class ChicagoStylePizza extends Pizza {

    ChicagoStylePizza(String name, String toppingList) {
        super(name, "Thick dough", "Tomato sauce", toppingList);
    }

}
