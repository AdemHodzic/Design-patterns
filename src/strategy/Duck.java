package strategy;

public abstract class Duck {
	
	protected FlyBehaviour flyBehaviour;
	protected QuackBehaviour quackBehaviour;
	
	public abstract void display();
	public void swim() {
		System.out.println("Every duck can swim.");
	}
	
	public void fly() {
		flyBehaviour.fly();
	}
	
	public void quack() {
		quackBehaviour.quack();
	}
	public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
		this.flyBehaviour = flyBehaviour;
	}
	public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
		this.quackBehaviour = quackBehaviour;
	}
	
	
}
