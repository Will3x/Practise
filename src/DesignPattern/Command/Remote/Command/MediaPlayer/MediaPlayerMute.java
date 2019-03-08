package DesignPattern.Command.Remote.Command.MediaPlayer;

import DesignPattern.Command.Remote.Command.Command;
import DesignPattern.Command.Remote.Receiver.ElectronicDevice;

public class MediaPlayerMute implements Command {

    private ElectronicDevice device;

    public MediaPlayerMute(ElectronicDevice device) {
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
