package factory;

public class SQLServerConnection implements Connection{

	@Override
	public String description() {
		return "SQLServer connection!";
	}

}
