package DesignPattern.Command.Remote.Receiver;

import DesignPattern.Command.Remote.Receiver.Behaviour.SoundBehaviour;

public class Calculator extends ElectronicDevice {

    public Calculator(SoundBehaviour soundBehaviour) {
        super(soundBehaviour);
    }

    @Override
    public String name() {
        return "Calculator";
    }



}
