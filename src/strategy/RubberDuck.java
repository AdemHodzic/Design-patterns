package strategy;

public class RubberDuck extends Duck{
	
	public RubberDuck() {
		super();
		this.quackBehaviour = new Squeek();
		this.flyBehaviour = new NoFlyBehaviour();
	}

	@Override
	public void display() {
		System.out.println("This is rubber ducky");
	}
}
