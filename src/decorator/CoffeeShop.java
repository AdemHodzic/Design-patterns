package decorator;

public class CoffeeShop {

	public static void main(String[] args) {
		
		Coffee crna = new Coffee();
		Coffee bijela = new Coffee();
		Coffee djecija = new Coffee();
		
		bijela = new MilkCoffeeDecorator(bijela);
		bijela = new MilkCoffeeDecorator(bijela);
		bijela = new MilkCoffeeDecorator(bijela);
		
		djecija = new ChochlateCoffeeDecorator(djecija);
		
		System.out.println(crna.getName());
		System.out.println(bijela.getName());
		System.out.println(djecija.getName());
	}

}
