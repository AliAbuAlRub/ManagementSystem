
public interface Observable {
	public void registerObserver(Observer observer);
	public void notifyObservers();
	public void notifyObservers(String message);
	public void removeObserver(Observer observer);
}
