package DesignPattern.Command.Remote.Command.Stereo;

import DesignPattern.Command.Remote.Command.Command;
import DesignPattern.Command.Remote.Receiver.ElectronicDevice;

public class StereoMute implements Command {

    private ElectronicDevice device;

    public StereoMute(ElectronicDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.mute();
    }

    @Override
    public void undo() {
        device.volumeUp();
    }
}
