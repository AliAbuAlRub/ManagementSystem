
public class BaseEmployee extends Employee {
	Task[] tasks ;

	public BaseEmployee(int eid, String name, int did, String email) {
		super(eid, name, did, email);
	}

	public BaseEmployee() {
		super();
	}

	public Task[] getTasks() {
		return tasks;
	}

	public void setTasks(Task[] tasks) {
		this.tasks = tasks;
	}
	
	
	
}
