package DesignPattern.Command.Remote.Receiver.Behaviour;

public class HasSound implements SoundBehaviour {

    @Override
    public String volumeUp() {
        return "Raising the volume!";
    }

    @Override
    public String volumeDown() {
        return "Lowering the volume!";
    }

    @Override
    public String mute() {
        return "Receiver is now quiet! sshhhh";
    }
}
