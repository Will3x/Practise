package DesignPattern.Factory.FactoryMethod;

abstract class NYStylePizza extends Pizza {

    NYStylePizza(String name, String toppingList) {
        super(name, "Crisp thin dough", "Marinara sauce", toppingList);
    }

    @Override
    void cut() {
        System.out.println("Cutting the pizza into big slices...");
    }
}
