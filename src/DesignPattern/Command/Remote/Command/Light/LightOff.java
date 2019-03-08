package DesignPattern.Command.Remote.Command.Light;

import DesignPattern.Command.Remote.Command.Command;
import DesignPattern.Command.Remote.Receiver.ElectronicDevice;

public class LightOff implements Command {

    private ElectronicDevice device;

    public LightOff(ElectronicDevice device) {
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
