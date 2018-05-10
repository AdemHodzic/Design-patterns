package template;

public abstract class RobotTemplate {
	
	final void go() {
		start();
		assemble();
		test();
		stop();
	}
	
	public abstract void start();
	public abstract void assemble();
	public abstract void test();
	public abstract void stop();

	
}
