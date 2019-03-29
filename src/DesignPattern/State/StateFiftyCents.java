package DesignPattern.State;

public class StateFiftyCents implements State {

    private VendingMachine context;

    StateFiftyCents(VendingMachine context) {
        this.context = context;
    }


    @Override
    public void insertFiftyCents() {
        context.setCurrentState(new StateOneEuro(context));
    }

    @Override
    public void insertOneEuro() {

    }

    @Override
    public void insertTwoEuro() {

    }

    @Override
    public float currentAmountInserted() {
        return 0.50f;
    }
}
