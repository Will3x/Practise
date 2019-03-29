package DesignPattern.State;

public class StateOneEuro implements State {

    private VendingMachine context;

    StateOneEuro(VendingMachine context) {
        this.context = context;
    }

    @Override
    public void insertFiftyCents() {

    }

    @Override
    public void insertOneEuro() {

    }

    @Override
    public void insertTwoEuro() {

    }

    @Override
    public float currentAmountInserted() {
        return 1.00f;
    }
}
