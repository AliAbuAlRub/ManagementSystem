
public class Project implements Observable {
	private int Pid;
	private Task[] tasks;

	@Override
	public void registerObserver(Observer observer) {

	}

	@Override
	public void notifyObservers() {

	}

	@Override
	public void removeObserver(Observer observer) {

	}

	public int getPid() {
		return Pid;
	}

	public void setPid(int pid) {
		Pid = pid;
	}

	public Task[] getTasks() {
		return tasks;
	}

	public void setTasks(Task[] tasks) {
		this.tasks = tasks;
	}

	@Override
	public void notifyObservers(String message) {
		// TODO Auto-generated method stub

	}

}
