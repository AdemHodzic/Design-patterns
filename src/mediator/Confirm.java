package mediator;

import java.util.Scanner;

public class Confirm implements Window{

	private Mediator mediator;
	private String response;
	
	public Confirm(Mediator mediator) {
		this.mediator = mediator;
	}
	
	@Override
	public void go() {
		Scanner input = new Scanner(System.in);
		System.out.println("Purchase confimed!");
		System.out.println("Do you want to go to welcome page (y/n) ? ");
		String ans = input.nextLine();
		if(ans.equals("y"))
			mediator.handle("confirm.welcome");
		else
			mediator.handle("confirm.exit");
	}

}
