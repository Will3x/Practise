package DesignPattern.Command.Remote.Command.Stereo;

import DesignPattern.Command.Remote.Command.Command;
import DesignPattern.Command.Remote.Receiver.ElectronicDevice;

public class StereoVolumeDown implements Command {

    private ElectronicDevice device;

    public StereoVolumeDown(ElectronicDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.volumeDown();
    }

    @Override
    public void undo() {
        device.volumeUp();
    }
}
