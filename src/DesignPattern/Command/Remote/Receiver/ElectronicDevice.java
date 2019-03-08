package DesignPattern.Command.Remote.Receiver;

import DesignPattern.Command.Remote.Receiver.Behaviour.SoundBehaviour;

public abstract class ElectronicDevice {

    private boolean isDeviceOn;
    private SoundBehaviour soundBehaviour;

    public ElectronicDevice(SoundBehaviour soundBehaviour) {
        this.isDeviceOn = false;
        this.soundBehaviour = soundBehaviour;
    }

    public abstract String name();

    public void volumeUp() {
        if(isDeviceOn)
            System.out.println(name() + ": " + soundBehaviour.volumeUp());
    }

    public void volumeDown() {
        if(isDeviceOn)
            System.out.println(name() + ": " + soundBehaviour.volumeDown());
    }

    public void mute() {
        if(isDeviceOn)
            System.out.println(name() + ": " + soundBehaviour.mute());
    }

    public void on(){
        System.out.println(name() + ": On!");
        isDeviceOn = true;
    }
    public void off(){
        System.out.println(name() + ": Off");
        isDeviceOn = false;
    }
}
