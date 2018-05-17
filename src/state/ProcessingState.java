package state;

public class ProcessingState implements State{

	Automat automat;
	
	
	
	public ProcessingState(Automat automat) {
		super();
		this.automat = automat;
	}

	@Override
	public void gotApplication() {
		System.out.println("Please wait while we are processing the application.");
	}

	@Override
	public void processApplication() {
		System.out.println("Processing applicaiton...");
		if(automat.getApartments() > 0) {
			automat.setState(automat.getFreeState());
		}else {
			automat.setState(automat.getFullState());
		}
	}

	@Override
	public void rentApartmant() {
		System.out.println("Please wait while we are processing the application.");
		
	}

	@Override
	public void dispenseKeys() {
		System.out.println("Please wait while we are processing the application.");
		
	}

}
