package state;

public interface Automat {
	
	public void submitApplication();
	public void checkApplication();
	public void processApplication();
	public void setState(State state);
	public State getWaitingState();
	public State getProcessingState();
	public State getFreeState();
	public State getFullState();
	public int getApartments();
	public void setApartments(int apartments);
}
