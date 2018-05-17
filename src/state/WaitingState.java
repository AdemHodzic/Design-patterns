package state;

public class WaitingState implements State{

	Automat automat;
	
	public WaitingState(Automat automat) {
		super();
		this.automat = automat;
	}

	@Override
	public void gotApplication() {
		System.out.println("Thank you for your application.");
		automat.setState(automat.getProcessingState());
	}

	@Override
	public void processApplication() {
		System.out.println("You need to submit application first");
	}

	@Override
	public void rentApartmant() {
		System.out.println("You need to submit application first");		
	}

	@Override
	public void dispenseKeys() {
		System.out.println("You need to submit application first");		
	}

	
	
}
