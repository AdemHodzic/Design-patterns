package factory;

public class ConnectionFactoryImpl extends ConnectionFactory{

	private String type;
	
	public ConnectionFactoryImpl(String type) {
		this.type = type;
	}
	
	@Override
	public Connection createConntection() {
		Connection connection;
		
		if(this.type.equals("oracle"))
			connection = new OracleConnection();
		else if(this.type.equals("sqlserver"))
			connection = new SQLServerConnection();
		else if(this.type.equals("mysql"))
			connection = new MySQLConnection();
		else
			connection = new GenericConnection();
		
		return connection;
	}

}
