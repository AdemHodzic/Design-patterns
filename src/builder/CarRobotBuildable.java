package builder;

import java.util.List;

public class CarRobotBuildable implements Robot{

	private List<Integer> commands;
	
	@Override
	public void setCommands(List<Integer> list) {
		this.commands = list;
		
	}

	@Override
	public void start() {
		System.out.println("Car robot starting...");
	}

	@Override
	public void assemble() {
		System.out.println("Assembling the engine...");
		
	}

	@Override
	public void test() {
		System.out.println("Starting the car...");
		
	}

	@Override
	public void end() {
		System.out.println("Car robot shutting down...");
		
	}

	@Override
	public void go() {
		for(Integer i : commands) {
			switch(i) {
				case 0:
					start();
					break;
				case 1:
					assemble();
					break;
				case 2:
					test();
					break;
				case 3:
					end();
					break;
			}
		}
	}
	
	


	
}
