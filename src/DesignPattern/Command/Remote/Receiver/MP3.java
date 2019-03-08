package DesignPattern.Command.Remote.Receiver;

import DesignPattern.Command.Remote.Receiver.Behaviour.SoundBehaviour;

public class MP3 extends ElectronicDevice{

    public MP3(SoundBehaviour soundBehaviour) {
        super(soundBehaviour);
    }

    @Override
    public String name() {
        return "MP3";
    }

}
