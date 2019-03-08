package DesignPattern.Command.Remote.Command.Light;

import DesignPattern.Command.Remote.Command.Command;
import DesignPattern.Command.Remote.Receiver.ElectronicDevice;

public class LightOn implements Command {

    private ElectronicDevice device;

    public LightOn(ElectronicDevice device) {
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

