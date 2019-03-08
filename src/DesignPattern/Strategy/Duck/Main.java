package DesignPattern.Strategy.Duck;

import DesignPattern.Strategy.Duck.Context.*;

public class Main {
    public static void main(String[] args) {

        DuckFactory f = new DuckFactory();

        for (int i = 0; i < 5; i++) {
            Duck duck = f.createDuck();

            System.out.println("You got a: " + duck.getName());
            System.out.println(duck.getName() + ": " + duck.quack());
            System.out.println(duck.fly());
            System.out.println(duck.getDisplay());
            System.out.println(duck.swim());
            System.out.println(duck.diet());
            System.out.println("------------------------------");
        }
    }
}
