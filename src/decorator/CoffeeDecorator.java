package decorator;

public abstract class CoffeeDecorator extends Coffee implements Decorator {
	
	Coffee cofee;
	
	public CoffeeDecorator(Coffee coffee) {
		this.cofee = coffee;
	}
	
	
}
