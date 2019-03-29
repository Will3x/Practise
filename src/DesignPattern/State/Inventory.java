package DesignPattern.State;

import java.util.ArrayList;

class Inventory {

    private ArrayList<Stock> stockList;

    Inventory() {
        this.stockList = new ArrayList<>();
    }

    public void addStock(Stock s){
        stockList.add(s);
    }

    public ArrayList<Stock> getStockList() {
        return stockList;
    }
}
