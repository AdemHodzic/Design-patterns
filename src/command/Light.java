package command;

public class Light {
	
	private String state = ".";

	public Light() {}
	
	public Light(String state) {
		super();
		this.state = state;
	}

	public String getState() {
		return state;
	}

	public void lightOn() {
		this.state = "*";
	}
	
	public void lightOff() {
		this.state = ".";
	}
	
	
}
