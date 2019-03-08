package DesignPattern.Command.Remote;

import DesignPattern.Command.Remote.Command.Calculator.*;
import DesignPattern.Command.Remote.Command.Command;
import DesignPattern.Command.Remote.Command.Light.*;
import DesignPattern.Command.Remote.Command.MediaPlayer.*;
import DesignPattern.Command.Remote.Command.Stereo.*;
import DesignPattern.Command.Remote.Invoker.Remote;
import DesignPattern.Command.Remote.Receiver.Behaviour.*;
import DesignPattern.Command.Remote.Receiver.*;

public class Client {

    public static void main(String[] args){
        Remote remote = new Remote();

        ElectronicDevice stereo = new Stereo(new HasSound());
        ElectronicDevice MP3 = new MP3(new HasSound());
        ElectronicDevice calculator = new Calculator(new NoSound());
        ElectronicDevice light = new Light(new NoSound());

        Command lightOn = new LightOn(light);
        Command lightOff = new LightOff(light);

        Command calculatorOn = new CalculatorOn(calculator);
        Command calculatorOff = new CalculatorOff(calculator);
        
        Command stereoOn = new StereoOnCommand(stereo);
        Command stereoOff = new StereoOffCommand(stereo);
        Command stereoVolumeLower = new StereoVolumeDown(stereo);
        Command stereoVolumeHigher = new StereoVolumeUp(stereo);
        Command stereoMute = new StereoMute(stereo);

        Command mpTurnOn = new MediaPlayerOn(MP3);
        Command mpTurnOff = new MediaPlayerOff(MP3);
        Command mpLowerVolume = new MediaPlayerLowerVolume(MP3);
        Command mpRaiseVolume = new MediaPlayerRaiseVolume(MP3);
        Command mpMute = new MediaPlayerMute(MP3);

        remote.setCommands(0, stereoOn, stereoOff, stereoVolumeHigher, stereoVolumeLower, stereoMute);
        remote.setCommands(1, mpTurnOn, mpTurnOff, mpRaiseVolume, mpLowerVolume, mpMute);
        remote.setCommands(2, calculatorOn, calculatorOff);
        remote.setCommands(3, lightOn, lightOff);

        System.out.println(remote);

        System.out.println("====== Test 1 =========");
        remote.turnAllDevicesOn();
        System.out.println("-----------------------");
        remote.turnAllDevicesOff();
        System.out.println("=======================");
        System.out.println("\n");

        System.out.println("====== Test 2 =========");
        remote.increaseSound(1); // Receiver is off. Does nothing.
        remote.turnDeviceOn(1);
        remote.increaseSound(1); // Now it does work :)
        System.out.println("=======================");
        System.out.println("\n");

        System.out.println("====== Test 3 =========");
        remote.muteSound(1);
        remote.turnAllDevicesOn();
        remote.increaseSound(1); // Raise volume
        remote.undo(); // Lower volume
        System.out.println("=======================");
    }

}
