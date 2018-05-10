package builder;

import java.util.LinkedList;
import java.util.List;

public class CarRobotBuilder implements RobotBuilder{

	private List<Integer> commands;
	private Robot robot;
	
	public CarRobotBuilder() {
		robot = new CarRobotBuildable();
		commands = new LinkedList<>();
		commands.add(new Integer(0));
	}
	
	@Override
	public void addStart() {
		commands.add(new Integer(0));
			
	}

	@Override
	public void addAssemble() {
		commands.add(new Integer(1));
		
	}

	@Override
	public void addTest() {
		commands.add(new Integer(2));
		
	}

	@Override
	public void addEnd() {
		commands.add(new Integer(3));
	}

	public Robot go() {
		robot.setCommands(commands);
		return robot;
	}

}
