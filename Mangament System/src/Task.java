import java.util.ArrayList;

public class Task implements Observable {
	private int id;
	private Task[] tasks;
	private boolean isdone;
	ArrayList<Observer> observers = new ArrayList<>() ;

	@Override
	public void registerObserver(Observer observer) {
		

	}

	@Override
	public void notifyObservers() {
	

	}

	@Override
	public void removeObserver(Observer observer) {
		
	}

}
