package chainOfResponsibility;

public class SeniorDeveloper implements Helper{

	private Helper helper;
	private final int SENIOR_HELP = 2;
	
	
	public SeniorDeveloper() {
		super();
		this.helper = new TeamLead();
	}

	@Override
	public void help(int helpConst) {
		if(helpConst != SENIOR_HELP)
			helper.help(helpConst);
		else
			System.out.println("Senior developer is coming your way.");
	}
	
	

}
