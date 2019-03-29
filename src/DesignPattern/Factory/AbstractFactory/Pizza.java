package DesignPattern.Factory.AbstractFactory;

import DesignPattern.Factory.AbstractFactory.Ingredients.*;

public abstract class Pizza {

    private String name;
    Dough dough;
    Sauce sauce;
    Cheese cheese;

    abstract void prepare();

    void bake() {
        System.out.println("Baking the pizza in a hot oven...");
    }

    void cut() {
        System.out.println("Cutting the pizza...");
    }

    void box() {
        System.out.println("Placing the pizza in a box...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}