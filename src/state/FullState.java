package state;

public class FullState implements State{

	Automat automat;
	
	
	public FullState(Automat automat) {
		super();
		this.automat = automat;
	}

	@Override
	public void gotApplication() {
		System.out.println("Unfortunately, we are full.");
	}

	@Override
	public void processApplication() {
		System.out.println("Unfortunately, we are full.");		
	}

	@Override
	public void rentApartmant() {
		System.out.println("Unfortunately, we are full.");
	}

	@Override
	public void dispenseKeys() {
	}

}
