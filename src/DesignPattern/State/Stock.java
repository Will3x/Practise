package DesignPattern.State;

public class Stock {

    private final int MAX = 10;
    private int amount;
    private Beverage placeholder;

    Stock(Beverage beverage) {
        this.placeholder = beverage;
        amount = 0;
    }

    void addBeverage(){
        if(amount < MAX) {
            amount++;
        } else {
            System.out.println("This stock is full!");
        }
    }

    private int getAmount(){
        return amount;
    }

    public float getPlaceholderPrice(){
        return this.placeholder.price();
    }

    String getPlaceholderName(){
        return this.placeholder.getName();
    }

}
