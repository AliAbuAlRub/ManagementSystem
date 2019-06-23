
public class Employee {

	private int eid ; 
	private String name ; 
	private int did ; 
	private String email ;
	public Employee(int eid, String name, int did, String email) {
		this.eid = eid;
		this.name = name;
		this.did = did;
		this.email = email;
	}
	public Employee() {
		super();
	} 
	
	
	Employee getInstance(String x) {
		if (x.equalsIgnoreCase("manager")) {
			return new Manger();
		}else if(x.equalsIgnoreCase("baseEmployee")) {
			return new BaseEmployee();

		}else {
			return null ; 
		}
		
	}
	
}
