package abstract_factory;

import java.util.Scanner;

public class App {

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Select your theme:"
				+ "\n1.Dark theme"
				+ "\n2.Light theme"
				+ "\n3.Blue theme");
		
		int choice;
		do {
			choice = input.nextInt();
		} while (choice < 1 || choice > 3);
		
		ThemeFactory factory = buildFactory(choice);
		
		Window window = new Window(factory.getButton(),factory.getLabel());
		window.displayButton();
		window.displayLabel();
		
		input.close();
	
	}
	
	private static ThemeFactory buildFactory(int choice) {
		switch(choice) {
			case 1:
				return new DarkThemeFactory();
			case 2:
				return new LightThemeFactory();
			case 3:
				return new BlueThemeFactory();
		}
		return null;
	}
	
}
