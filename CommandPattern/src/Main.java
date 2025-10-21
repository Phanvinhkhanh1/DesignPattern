//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Light livingRoomLight = new Light();
        Command turnOn = new TurnOnLightCommand(livingRoomLight);
        Command turnOff = new TurnOffLightCommand(livingRoomLight);

        RemoteControl remoteControl = new RemoteControl();

        remoteControl.setCommand(turnOn);
        remoteControl.pressButton();
        remoteControl.pressUndo();

        remoteControl.setCommand(turnOff);
        remoteControl.pressButton();
        remoteControl.pressUndo();
    }
}