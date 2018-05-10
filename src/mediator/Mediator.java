package mediator;

public class Mediator {
	
	private Window welcome;
	private Window purchase;
	private Window confirm;
	private Window exit;
	
	public Mediator() {
		welcome = new Welcome(this);
		purchase = new Purchase(this);
		confirm = new Confirm(this);
		exit = new Exit(this);
	}
	
	public void handle(String window) {
		switch(window) {
		case "welcome.purchase":
			purchase.go();
			break;
		case "welcome.exit":
			exit.go();
			break;
		case "purchase.confirm":
			confirm.go();
			break;
		case "purchase.exit":
			exit.go();
			break;
		case "confirm.welcome":
			welcome.go();
			break;
		case "confirm.exit":
			exit.go();
			break;
		}
	}
	
	public void start() {
		welcome.go();
	}
	
	
	
}
