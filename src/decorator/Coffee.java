package decorator;

public class Coffee {
	
	String name = "Cofee";
	int price = 1;
	Decorator decorator;
	
	public Coffee() {}
	public Coffee( Decorator decorator) {
		this.decorator = decorator;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getPrice() {
		return this.price;
	}
}
