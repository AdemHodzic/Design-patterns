package template;

public class CarRobot extends RobotTemplate{

	@Override
	public void start() {
		System.out.println("Starting Car robot...");
	}

	@Override
	public void assemble() {
		System.out.println("getting the parts...");
	}

	@Override
	public void test() {
		System.out.println("Starting the car...");
	}

	@Override
	public void stop() {
		System.out.println("Car robot shutting down...");
	}

}
