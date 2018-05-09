package decorator;

public class MilkCoffeeDecorator extends CoffeeDecorator{

	Coffee coffee;
	
	public MilkCoffeeDecorator(Coffee coffee) {
		super(coffee);
		this.coffee = coffee;
	}
	
	public int getPrice() {
		return this.coffee.getPrice() + 2;
	}
	
	public String getName() {
		return this.coffee.getName() + " with Milk";
	}

}
