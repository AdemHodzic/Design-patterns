package mediator;

import java.util.Scanner;

public class Welcome implements Window{

	private Mediator mediator;
	private String res;
	public Welcome(Mediator mediator) {
		this.mediator = mediator;
	}

	@Override
	public void go() {
		Scanner input = new Scanner(System.in);
		System.out.println("Do you want to shop with us (y/n) ?");
		String ans = input.nextLine();
		if(ans.equals("y"))
			mediator.handle("welcome.purchase");
		else
			mediator.handle("welcome.exit");
	}

}
