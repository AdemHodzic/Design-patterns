package command;

public class LightOnCommand implements Command{

	private Light light;
	
	public LightOnCommand(Light light) {
		super();
		this.light = light;
	}

	@Override
	public void execute() {
		this.light.lightOn();
	}

	@Override
	public void unexecute() {
		this.light.lightOff();
	}

}
