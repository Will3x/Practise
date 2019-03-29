package DesignPattern.Factory.AbstractFactory;

import DesignPattern.Factory.AbstractFactory.Ingredients.*;

public class NYPizzaIngeredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return null;
    }
}
