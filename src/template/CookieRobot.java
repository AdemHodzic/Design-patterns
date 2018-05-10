package template;

public class CookieRobot extends RobotTemplate{

	@Override
	public void start() {
		System.out.println("Starting the Cookie Robot...");
	}

	@Override
	public void assemble() {
		System.out.println("Getting the ingridients...");
	}

	@Override
	public void test() {
		System.out.println("Tasting the cookies...");
	}

	@Override
	public void stop() {
		System.out.println("Cookie Robot shutting down...");
	}

}
