package command;

public class LightOffCommand implements Command{

	private Light light;
	
	public LightOffCommand(Light light) {
		super();
		this.light = light;
	}

	@Override
	public void execute() {
		this.light.lightOff();
	}

	@Override
	public void unexecute() {
		this.light.lightOn();
	}

}
