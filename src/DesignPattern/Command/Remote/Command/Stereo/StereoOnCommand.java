package DesignPattern.Command.Remote.Command.Stereo;

import DesignPattern.Command.Remote.Command.Command;
import DesignPattern.Command.Remote.Receiver.ElectronicDevice;

public class StereoOnCommand implements Command {

    private ElectronicDevice device;

    public StereoOnCommand(ElectronicDevice device) {
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
