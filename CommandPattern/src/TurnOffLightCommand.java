public class TurnOffLightCommand implements Command {

    private Light light;

    public TurnOffLightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void undo() {
        light.turnOn();
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}
