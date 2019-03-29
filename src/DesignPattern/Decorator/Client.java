package DesignPattern.Decorator;

import DesignPattern.Decorator.Component.Beverage;
import DesignPattern.Decorator.Component.Coffee;
import DesignPattern.Decorator.Decorator.Milk;
import DesignPattern.Decorator.Decorator.Mocha;

public class Client {
    public static void main(String[] args){

        Beverage coffee = new Mocha(new Milk(new Coffee()));
        System.out.println(coffee.description() + "\n$" + coffee.cost());

    }

}
