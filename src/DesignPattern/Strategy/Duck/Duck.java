package DesignPattern.Strategy.Duck;

public abstract class Duck {

    private Quackable quackable;
    private Flyable flyable;
    private Diet diet;
    private String name;

    Duck(String name, Quackable quackable, Flyable flyable, Diet diet) {
        this.name = name;
        this.quackable = quackable;
        this.flyable = flyable;
        this.diet = diet;
    }

    public abstract String getDisplay();

    String getName() {
        return name;
    }

    String swim() {
        return "Swimming..";
    }

    String fly() {
        return flyable.fly();
    }

    String quack() {
        return quackable.quack();
    }

    String diet() {
        return diet.diet();
    }
}

class DecoyDuck extends Duck {
    DecoyDuck() {
        super("Decoy duck", new MuteQuack(), new NoFly(), new NoDiet());
    }

    @Override
    public String getDisplay() {
        return "A wooden decoy duck.";
    }

}

class Mallard extends Duck {
    Mallard() {
        super("Mallard", new Quack(), new FlyWithWings(), new PlantDiet());
    }

    @Override
    public String getDisplay() {
        return "Majestic duck";
    }

}

class RubberDuck extends Duck {
    RubberDuck() {
        super("Rubber Duck", new Squeak(), new NoFly(), new NoDiet());
    }

    @Override
    public String getDisplay() {
        return "A yellow duckling.";
    }

}

class RuddyDuck extends Duck {
    RuddyDuck() {
        super("Ruddy Duck", new Quack(), new FlyWithWings(), new PlantDiet());
    }

    @Override
    public String getDisplay() {
        return "A beautiful duck with a blue beak.";
    }

}
