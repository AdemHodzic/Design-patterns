package template;

public class App {

	public static void main(String[] args) {
		CarRobot carRobot = new CarRobot();
		CookieRobot cookieRobot = new CookieRobot();
		
		System.out.println("Car robot: ");
		carRobot.go();
		
		System.out.println();
		
		System.out.println("Cookie robot: ");
		cookieRobot.go();
		
		
	}

}
