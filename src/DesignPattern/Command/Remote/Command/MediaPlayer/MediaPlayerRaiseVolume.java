package DesignPattern.Command.Remote.Command.MediaPlayer;

import DesignPattern.Command.Remote.Command.Command;
import DesignPattern.Command.Remote.Receiver.ElectronicDevice;

public class MediaPlayerRaiseVolume implements Command {

    private ElectronicDevice device;

    public MediaPlayerRaiseVolume(ElectronicDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.volumeUp();
    }

    @Override
    public void undo() {
        device.volumeDown();
    }
}
