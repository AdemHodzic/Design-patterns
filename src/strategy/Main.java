package strategy;

public class Main {

	public static void main(String[] args) {
		
		Duck rubber = new RubberDuck();
		Duck superDuck = new SuperDuck();
		
		rubber.display();
		rubber.fly();
		rubber.quack();
		
		superDuck.display();
		superDuck.fly();
		superDuck.quack();
		
		rubber.setFlyBehaviour(new FlyingWithRockets());
		rubber.display();
		rubber.fly();
		rubber.quack();
		
	}

}
