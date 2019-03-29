package DesignPattern.Factory.AbstractFactory;

import DesignPattern.Factory.AbstractFactory.Ingredients.*;

public interface PizzaIngredientFactory {

    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();

}
