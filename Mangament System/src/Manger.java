
public class Manger extends Employee implements Observer {
	private Project[] projects;
	
	
	public Manger(int eid, String name, int did, String email, Project[] projects) {
		super(eid, name, did, email);
		this.projects = projects;
	}

	

	public Manger() {
		super();
	}



	public Project[] getProjects() {
		return projects;
	}



	public void setProjects(Project[] projects) {
		this.projects = projects;
	}



	@Override
	public void update(String o) {
		System.out.println(o);
	}

}
