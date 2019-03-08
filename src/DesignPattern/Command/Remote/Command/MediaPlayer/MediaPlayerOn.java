package DesignPattern.Command.Remote.Command.MediaPlayer;

import DesignPattern.Command.Remote.Command.Command;
import DesignPattern.Command.Remote.Receiver.ElectronicDevice;

public class MediaPlayerOn implements Command {

    private ElectronicDevice device;

    public MediaPlayerOn(ElectronicDevice device) {
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
