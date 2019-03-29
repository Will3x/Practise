package DesignPattern.State;

public interface State {

    void insertFiftyCents();
    void insertOneEuro();
    void insertTwoEuro();
    float currentAmountInserted();

}
