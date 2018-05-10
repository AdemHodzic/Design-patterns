package builder;

public class App {
	
	public static void main(String[] args) {
		CarRobotBuilder builder = new CarRobotBuilder();
		
		builder.addAssemble();
		builder.addTest();
		builder.addTest();
		builder.addAssemble();
		builder.addEnd();
		
		Robot robot = builder.go();
		robot.go();
	}
}
