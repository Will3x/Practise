package DesignPattern.Command.Remote.Invoker;

import DesignPattern.Command.Remote.Command.Command;
import DesignPattern.Command.Remote.Command.NoCommand;

import java.util.ArrayList;
import java.util.Stack;

public class Remote {

    private ArrayList<CommandGroup> commandGroupList;
    private Stack<Command> history;

    public Remote() {
        commandGroupList = new ArrayList<>();
        history = new Stack<>();
    }

    public void setCommands(int slot, Command on, Command off) {
        commandGroupList.add(slot, new CommandGroup(on, off, new NoCommand(), new NoCommand(), new NoCommand()));
    }

    public void setCommands(int slot, Command on, Command off, Command volumeUp, Command volumeDown, Command mute) {
        commandGroupList.add(slot, new CommandGroup(on, off, volumeUp, volumeDown, mute));
    }

    public void removeCommands(int slot) {
        commandGroupList.remove(slot);
    }

    public void turnDeviceOn(int slot) {
        Command turnOnCommand = commandGroupList.get(slot).getTurnOnCommand();
        turnOnCommand.execute();
        history.push(turnOnCommand);
    }

    public void turnDeviceOff(int slot) {
        Command turnOffCommand = commandGroupList.get(slot).getTurnOffCommand();
        turnOffCommand.execute();
        history.push(turnOffCommand);
    }

    public void turnAllDevicesOn() {
        for (CommandGroup c : commandGroupList) {
            c.getTurnOnCommand().execute();
            history.push(c.getTurnOnCommand());
        }
    }

    public void turnAllDevicesOff() {
        for (CommandGroup c : commandGroupList) {
            c.getTurnOffCommand().execute();
            history.push(c.getTurnOffCommand());
        }
    }

    public void increaseSound(int slot) {
        Command volumeUpCommand = commandGroupList.get(slot).getVolumeUpCommand();
        volumeUpCommand.execute();
        history.push(volumeUpCommand);
    }

    public void decreaseSound(int slot) {
        Command volumeDownCommand = commandGroupList.get(slot).getVolumeDownCommand();
        volumeDownCommand.execute();
        history.push(volumeDownCommand);
    }

    public void muteSound(int slot) {
        Command muteCommand = commandGroupList.get(slot).getMuteCommand();
        muteCommand.execute();
        history.push(muteCommand);
    }

    public void undo() {
        history.pop().undo();
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < commandGroupList.size(); i++) {
            s.append(i + 1).append("[").append(commandGroupList.get(i)).append("]\n");
        }
        return s.toString();
    }
}
