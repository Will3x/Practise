package DesignPattern.State;

class VendingMachine implements IVendingMachine {

    private State currentState;
    private Inventory inventory;

    VendingMachine() {
        inventory = new Inventory();
        setCurrentState(new BaseState(this));
    }

    @Override
    public void setCurrentState(State currentState) {
        this.currentState = currentState;
        displayCurrentAmountInserted();
    }

    @Override
    public void insertFiftyCents() {
        this.currentState.insertFiftyCents();
    }

    public void insertOneEuro() {
        this.currentState.insertOneEuro();
    }

    public void insertTwoEuro() {
        this.currentState.insertTwoEuro();
    }

    public void displayCurrentAmountInserted() {
        System.out.println("Currently inserted: " + currentState.currentAmountInserted() + " euro.");
    }

    public void reset() {
        System.out.println("Returning " + currentState.currentAmountInserted() + " euro.");
        setCurrentState(new BaseState(this));
    }

    public void buy(String item){
        inventory.getStockList().iterator();
    }
}
