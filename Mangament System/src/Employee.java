
public class Employee {

	private int eid ; 
	private String name ; 
	private int did ; 
	private String email ;
	private Qualifiqation[] qualifications;
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Qualifiqation[] getQualifications() {
		return qualifications;
	}
	public void setQualifications(Qualifiqation[] qualifications) {
		this.qualifications = qualifications;
	}
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
