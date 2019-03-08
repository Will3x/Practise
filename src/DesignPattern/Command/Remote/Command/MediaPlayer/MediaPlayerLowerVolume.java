package DesignPattern.Command.Remote.Command.MediaPlayer;

import DesignPattern.Command.Remote.Command.Command;
import DesignPattern.Command.Remote.Receiver.ElectronicDevice;

public class MediaPlayerLowerVolume implements Command {

    private ElectronicDevice device;

    public MediaPlayerLowerVolume(ElectronicDevice device) {
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
