package mediator;

import java.util.Scanner;

public class Purchase implements Window{

	private Mediator mediator;
	private String res;
	public Purchase(Mediator mediator) {
		this.mediator = mediator;
	}

	@Override
	public void go() {
		Scanner input = new Scanner(System.in);
		System.out.println("Confirm the purchase (y/n) ?");
		String ans = input.nextLine();
		if(ans.equals("y"))
			mediator.handle("purchase.confirm");
		else
			mediator.handle("purchase.exit");
	}

}
