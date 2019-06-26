
public class BaseEmployee extends Employee {
	Task[] tasks;

	public BaseEmployee() {
		super();
	}

	public Task[] getTasks() {
		return tasks;
	}

	public void setTasks(Task[] tasks) {
		this.tasks = tasks;
	}

	public void addTask(Task task) {

	}

}
