package state;

public class ApartmentAutomat implements Automat{
	
	private State current;
	private final State waitingState;
	private final State processingState;
	private final State fullState;
	private final State freeState;
	private int apartments;
	
	public ApartmentAutomat(int apartments) {
		super();
		this.waitingState = new WaitingState(this);
		this.processingState = new ProcessingState(this);
		this.fullState = new FullState(this);
		this.freeState = new FreeState(this);
		this.apartments = apartments;
		this.current = this.waitingState;
	}

	@Override
	public void submitApplication() {
		this.current.gotApplication();
	}

	@Override
	public void checkApplication() {
		this.current.processApplication();
	}

	@Override
	public void processApplication() {
		this.current.rentApartmant();
		this.current.dispenseKeys();
	}

	@Override
	public void setState(State state) {
		this.current = state;
	}

	@Override
	public State getWaitingState() {
		return this.waitingState;
	}

	@Override
	public State getProcessingState() {
		return this.processingState;
	}

	@Override
	public State getFreeState() {
		return this.freeState;
	}

	@Override
	public State getFullState() {
		return this.fullState;
	}

	@Override
	public int getApartments() {
		return this.apartments;
	}

	@Override
	public void setApartments(int apartments) {
		this.apartments = apartments;
	}
	
}
