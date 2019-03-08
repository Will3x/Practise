package DesignPattern.Command.Remote.Command.Calculator;

import DesignPattern.Command.Remote.Command.Command;
import DesignPattern.Command.Remote.Receiver.ElectronicDevice;

public class CalculatorOn implements Command {

    private ElectronicDevice device;

    public CalculatorOn(ElectronicDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.on();
    }

    @Override
    public void undo() {
        device.off();
    }
}
