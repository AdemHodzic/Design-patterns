package chainOfResponsibility;

import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		
		
		Helper helper = new JuinioDeveloper();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the level of your problem and developer with acording seniority will come to help you: ");
		System.out.println("1. Easy problem");
		System.out.println("2. Hard problem");
		System.out.println("3. Serious problem");
		
		int choice;
		do {
			choice = input.nextInt();
		} while (choice < 1 || choice > 3);
		
		helper.help(choice);
		
		input.close();
	}
}
