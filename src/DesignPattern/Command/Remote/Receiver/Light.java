package DesignPattern.Command.Remote.Receiver;

import DesignPattern.Command.Remote.Receiver.Behaviour.SoundBehaviour;

public class Light extends ElectronicDevice {

    public Light(SoundBehaviour soundBehaviour) {
        super(soundBehaviour);
    }

    @Override
    public String name() {
        return "Light";
    }

}
