package DesignPattern.State;

public class BaseState implements State {

    private VendingMachine context;

    BaseState(VendingMachine context) {
        this.context = context;
    }

    @Override
    public void insertFiftyCents() {
        this.context.setCurrentState(new StateFiftyCents(context));
    }

    @Override
    public void insertOneEuro() {

    }

    @Override
    public void insertTwoEuro() {

    }

    @Override
    public float currentAmountInserted() {
        return 0.00f;
    }
}
