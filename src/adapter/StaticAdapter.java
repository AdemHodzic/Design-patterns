package adapter;

public class StaticAdapter implements RequestInterface{

	@Override
	public void getRequest() {
		StaticAdaptee.staticSpecialRequest();
	}

}
