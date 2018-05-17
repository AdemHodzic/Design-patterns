package state;

public class FreeState implements State{

	Automat automat;
	
	
	
	public FreeState(Automat automat) {
		super();
		this.automat = automat;
	}

	@Override
	public void gotApplication() {
		System.out.println("Please wait for your key.");
	}

	@Override
	public void processApplication() {
		System.out.println("Please wait for your key.");
	}

	@Override
	public void rentApartmant() {
		System.out.println("Congratulations.You got your apartment");
	}

	@Override
	public void dispenseKeys() {
		automat.setApartments(automat.getApartments()-1);
		automat.setState(automat.getWaitingState());
	}

}
