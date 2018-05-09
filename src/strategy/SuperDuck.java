package strategy;

public class SuperDuck extends Duck{

	public SuperDuck() {
		super();
		this.flyBehaviour = new FlyingWithRockets();
		this.quackBehaviour = new HoldDoor();
	}
	
	@Override
	public void display() {
		System.out.println("SuperDuck to the rescue");
	}

	
	
}
