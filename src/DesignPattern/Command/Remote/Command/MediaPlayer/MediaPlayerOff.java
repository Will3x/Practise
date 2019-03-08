package DesignPattern.Command.Remote.Command.MediaPlayer;

import DesignPattern.Command.Remote.Command.Command;
import DesignPattern.Command.Remote.Receiver.ElectronicDevice;

public class MediaPlayerOff implements Command {

    private ElectronicDevice device;

    public MediaPlayerOff(ElectronicDevice device) {
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
