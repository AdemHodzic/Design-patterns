package command;

public class Invoker {
	
	private Command command;
	
	
	public Invoker(Command command) {
		super();
		this.command = command;
	}

	
	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void execute() {
		this.command.execute();
	}
	
	public void unexecute() {
		this.command.unexecute();
	}
	
}
