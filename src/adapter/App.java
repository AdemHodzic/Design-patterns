package adapter;

public class App {

	public static void main(String[] args) {
		RequestInterface obj = new Adapter(new Adaptee());
		RequestInterface staticObj = new StaticAdapter();
		obj.getRequest();
		staticObj.getRequest();
	}

}
