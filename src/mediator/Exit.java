package mediator;

public class Exit implements Window{
	private Mediator mediator;
	private String response = "n";
	
	public Exit(Mediator mediator) {
		this.mediator = mediator;
	}
	
	public void go() {
		System.out.println("Thank you for purchasing at Arizona.");
	}
}
