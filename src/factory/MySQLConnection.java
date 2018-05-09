package factory;

public class MySQLConnection implements Connection{

	@Override
	public String description() {
		return "MySQL connection!";
	}

}
