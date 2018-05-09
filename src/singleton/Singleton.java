package singleton;

public class Singleton {
	
	private double amountOfMoney;
	private static Singleton instance;
	
	private Singleton() {}

	public double getAmountOfMoney() {
		return amountOfMoney;
	}

	public void addTen() {
		this.amountOfMoney+=10;
	}
	
	public void addHundred() {
		this.amountOfMoney+=100;
	}
	
	public void addThousand() {
		this.amountOfMoney+=1000;
	}
	
	public void takeTen() {
		this.amountOfMoney-=10;
	}
	
	public void takeHundred() {
		this.amountOfMoney-=100;
	}
	
	public void takeThousand() {
		this.amountOfMoney-=1000;
	}
	
	public static Singleton getInstance() {
		if(instance == null)
			instance = new Singleton();
		return instance;
	}
}
