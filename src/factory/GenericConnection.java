package factory;

public class GenericConnection implements Connection{

	@Override
	public String description() {
		return "Generic database!";
	}

}
