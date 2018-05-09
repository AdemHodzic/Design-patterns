package strategy;

public class NoFlyBehaviour implements FlyBehaviour{

	@Override
	public void fly() {
		System.out.println("Some birds never fly.");
	}
	
}
