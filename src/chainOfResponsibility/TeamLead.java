package chainOfResponsibility;

public class TeamLead implements Helper{

	public TeamLead() {}
	
	@Override
	public void help(int helpConst) {
		System.out.println("Teeam lead is coming your way.");
	}

}
