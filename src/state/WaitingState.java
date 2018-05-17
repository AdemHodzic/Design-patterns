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
		
	}

	@Override
	public void processApplication() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rentApartmant() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispenseKeys() {
		// TODO Auto-generated method stub
		
	}

	
	
}
