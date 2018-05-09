package factory;

public class OracleConnection implements Connection{

	@Override
	public String description() {
		return "OracleDB connection!";
	}
	
}
