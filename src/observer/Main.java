package observer;

public class Main {
	
	public static void main(String[] args) {
		
		Market market = new Market();
		
		NewYorkMarket newYorkMarket = new NewYorkMarket(market);
		ParisMarket parisMarket = new ParisMarket(market);
		
		market.subscribe(newYorkMarket);
		market.subscribe(parisMarket);
		
		market.update();
		market.changePrices(100, 200, 250);
		market.unsubscribe(parisMarket);
		market.update();
	}
}
