import java.util.ArrayList;

public class Manger extends Employee implements Observer {
	private Project[] projects;
	private ArrayList<String> notifications;

	public Manger(int eid, String name, int did, String email, Project[] projects) {
		super(eid, name, did, email);
		this.projects = projects;
	}

	public Manger() {
		super();
		notifications = new ArrayList<String>();
	}

	public Project[] getProjects() {
		return projects;
	}

	public void setProjects(Project[] projects) {
		this.projects = projects;
	}

	@Override
	public void update(String o) {
		notifications.add(o);
	}

	public ArrayList<String> getNotifications() {
		return notifications;
	}

}
