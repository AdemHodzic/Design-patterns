package chainOfResponsibility;

public class JuinioDeveloper implements Helper{

	private Helper helper;
	private final int JUNIOR_HELP = 0;
	public JuinioDeveloper() {
		super();
		this.helper = new MediorDeveloper();
	}

	@Override
	public void help(int helpConst) {
		if(helpConst != JUNIOR_HELP)
			helper.help(helpConst);
		else
			System.out.println("Junio Developer is coming your way");
	}

}
