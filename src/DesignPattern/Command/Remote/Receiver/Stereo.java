package DesignPattern.Command.Remote.Receiver;

import DesignPattern.Command.Remote.Receiver.Behaviour.SoundBehaviour;

public class Stereo extends ElectronicDevice{

    public Stereo(SoundBehaviour soundBehaviour) {
        super(soundBehaviour);
    }

    @Override
    public String name() {
        return "Stereo";
    }

}
