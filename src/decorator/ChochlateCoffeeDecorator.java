package decorator;

public class ChochlateCoffeeDecorator extends CoffeeDecorator{

	Coffee coffee;
	
	public ChochlateCoffeeDecorator(Coffee coffee) {
		super(coffee);
		this.coffee = coffee;
	}
	
	public String getName() {
		return this.coffee.getName() + " with chochlate";
	}
	
	public int getPrice() {
		return this.coffee.getPrice() + 2;
	}
	
	
}
