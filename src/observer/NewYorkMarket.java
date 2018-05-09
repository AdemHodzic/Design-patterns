package observer;

public class NewYorkMarket implements Observer{

	private Market market;
	
	private int goog;
	private int yah;
	private int nasa;
	
	public NewYorkMarket(Market market) {
		super();
		this.market = market;
	}
	
	


	@Override
	public void update() {
		this.goog = this.market.getGoog();
		this.yah = this.market.getYah();
		this.nasa = this.market.getNasa();
		
		System.out.println("=====N E W  Y O R K=====");
		System.out.println("= " + this.goog + " = " + this.yah + " = " + this.nasa);
		System.out.println("========================");
		
	}

}
