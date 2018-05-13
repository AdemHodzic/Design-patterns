package adapter;

public class Adapter implements RequestInterface{

	private Adaptee adaptee;
	
	public Adapter(Adaptee adaptee) {
		this.adaptee = adaptee;
	}
	
	@Override
	public void getRequest() {
		adaptee.specialRequest();
	}
	
}
