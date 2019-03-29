package DesignPattern.State;

public interface IVendingMachine {

    void setCurrentState(State currentState);
    void insertFiftyCents();
    void insertOneEuro();
    void insertTwoEuro();
    void displayCurrentAmountInserted();
    void reset();

}
