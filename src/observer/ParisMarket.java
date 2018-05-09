package observer;

public class ParisMarket implements Observer{

	private Market market;
	private int goog;
	private int yah;
	private int nasa;
	
	
	
	public ParisMarket(Market market) {
		super();
		this.market = market;
	}
	
	


	@Override
	public void update() {
		this.goog = this.market.getGoog();
		this.yah = this.market.getYah();
		this.nasa = this.market.getNasa();
		
		System.out.println("=====P A R I S=====");
		System.out.println("= " + this.goog + " = " + this.yah + " = " + this.nasa);
		System.out.println("====================");
	}

}
