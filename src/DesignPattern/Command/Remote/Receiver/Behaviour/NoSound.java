package DesignPattern.Command.Remote.Receiver.Behaviour;

public class NoSound implements SoundBehaviour{

    @Override
    public String volumeUp() {
        return "No sound available for this device.";
    }

    @Override
    public String volumeDown() {
        return "No sound available for this device.";
    }

    @Override
    public String mute() {
        return "No sound available for this device.";
    }
}