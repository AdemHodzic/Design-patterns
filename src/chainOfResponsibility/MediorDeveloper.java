package chainOfResponsibility;

public class MediorDeveloper implements Helper{

	private Helper helper;
	private final int MEDIOR_HELP = 1;
	
	public MediorDeveloper() {
		super();
		this.helper = new SeniorDeveloper();
	}

	@Override
	public void help(int helpConst) {
		if(helpConst != MEDIOR_HELP)
			helper.help(helpConst);
		else
			System.out.println("Medior is coming your way.");
	}

}
