package DesignPattern.Command.Remote.Invoker;

import DesignPattern.Command.Remote.Command.Command;

class CommandGroup {

    private Command turnOnCommand, turnOffCommand, volumeUpCommand, volumeDownCommand, muteCommand;

    CommandGroup(Command turnOnCommand, Command turnOffCommand, Command volumeUpCommand, Command volumeDownCommand, Command mute) {
        this.turnOnCommand = turnOnCommand;
        this.turnOffCommand = turnOffCommand;
        this.volumeUpCommand = volumeUpCommand;
        this.volumeDownCommand = volumeDownCommand;
        this.muteCommand = mute;
    }

    Command getTurnOnCommand() {
        return turnOnCommand;
    }

    Command getTurnOffCommand() {
        return turnOffCommand;
    }

    Command getVolumeUpCommand() {
        return volumeUpCommand;
    }

    Command getVolumeDownCommand() {
        return volumeDownCommand;
    }

    Command getMuteCommand() {
        return muteCommand;
    }

    @Override
    public String toString() {
        return "CommandGroup{turnOnCommand=" + turnOnCommand.getClass().getSimpleName() +
                ", turnOffCommand=" + turnOffCommand.getClass().getSimpleName() +
                ", volumeUpCommand=" + volumeUpCommand.getClass().getSimpleName() +
                ", volumeDownCommand=" + volumeDownCommand.getClass().getSimpleName() +
                ", muteCommand=" + muteCommand.getClass().getSimpleName() +
                '}';
    }
}
