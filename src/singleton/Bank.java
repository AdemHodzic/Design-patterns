package singleton;

public class Bank {
	
	public static void main(String[] args) {
		Singleton bank = Singleton.getInstance();
		
		bank.addHundred();
		bank.addHundred();
		bank.addHundred();
		
		System.out.println("Amount of money in the bank is: " + bank.getAmountOfMoney());
		
		Singleton donator = Singleton.getInstance();
		
		donator.addThousand();
		donator.addThousand();
		
		System.out.println("Amount of money in the bank is: " + bank.getAmountOfMoney());
		
		Singleton user = Singleton.getInstance();
		
		user.takeTen();
		user.takeTen();
		user.takeHundred();

		System.out.println("Amount of money in the bank is: " + bank.getAmountOfMoney());
		
	}
}
