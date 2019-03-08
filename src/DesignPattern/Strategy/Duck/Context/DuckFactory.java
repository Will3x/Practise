package DesignPattern.Strategy.Duck.Context;

public class DuckFactory {

    public Duck createDuck(){
        int random = (int) (Math.random()*4);

        switch (random){
            case 0:
                return new Mallard();
            case 1:
                return new RubberDuck();
            case 2:
                return new DecoyDuck();
            case 3:
                return new RuddyDuck();
        }
        return null;
    }
}