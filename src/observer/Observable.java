package observer;

import java.util.*;

public interface Observable {
	
	ArrayList<Observer> list = new ArrayList<Observer>();
	
	public void subscribe(Observer observer);
	public void unsubscribe(Observer observer);
	public void update();
	
}
