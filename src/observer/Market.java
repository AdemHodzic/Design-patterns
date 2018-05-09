package observer;

public class Market implements Observable{
	
	
	private int goog;
	private int yah;
	private int nasa;
	
	public Market() {}

	public void changePrices(int goog, int yah, int nasa) {
		this.goog = goog;
		this.yah = yah;
		this.nasa = nasa;
		update();
	}
	
	@Override
	public void subscribe(Observer observer) {
		list.add(observer);
	}

	@Override
	public void unsubscribe(Observer observer) {
		list.remove(observer);
	}

	@Override
	public void update() {
		for(Observer observer : list) {
			observer.update();
		}
	}

	public int getGoog() {
		return goog;
	}

	public int getYah() {
		return yah;
	}

	public int getNasa() {
		return nasa;
	}
	
	
	
}
