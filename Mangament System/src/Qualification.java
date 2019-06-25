
public class Qualification {
	private int qid;
	private String description;

	public int getQid() {
		return qid;
	}

	public void setQid(int qid) {
		this.qid = qid;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Qualification(int qid, String description) {
		super();
		this.qid = qid;
		this.description = description;
	}

	public Qualification() {
	}

}
