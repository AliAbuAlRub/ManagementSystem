import java.util.ArrayList;

public class Task implements Observable {
	private int id;
	private Task[] tasks;
	private boolean isdone;
	private Qualification[] qualifications;
	ArrayList<Observer> observers = new ArrayList<>();

	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Task[] getTasks() {
		return tasks;
	}

	public void setTasks(Task[] tasks) {
		this.tasks = tasks;
	}

	public boolean isIsdone() {
		return isdone;
	}

	public void setIsdone(boolean isdone) {
		this.isdone = isdone;
	}

	public Qualification[] getQualifications() {
		return qualifications;
	}

	public void setQualifications(Qualification[] qualifications) {
		this.qualifications = qualifications;
	}

	public ArrayList<Observer> getObservers() {
		return observers;
	}

	@Override
	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			observers.get(i).update("updated!!");
		}
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

}
