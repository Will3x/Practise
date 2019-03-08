package DesignPattern.Command.Remote.Command.Calculator;

import DesignPattern.Command.Remote.Command.Command;
import DesignPattern.Command.Remote.Receiver.ElectronicDevice;

public class CalculatorOff implements Command {

    private ElectronicDevice device;

    public CalculatorOff(ElectronicDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.off();
    }

    @Override
    public void undo() {
        device.on();
    }
}
