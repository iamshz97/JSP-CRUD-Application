package Business;

public class JobUser extends Job {
	private String juID;

	public JobUser() {
		super();
		// TODO Auto-generated constructor stub
	}


	public JobUser(String juID,String jID, String jobName) {
		super(jID, jobName);
		this.juID = juID;
		// TODO Auto-generated constructor stub
	}


	
	public String getJuID() {
		return juID;
	}


	public void setJuID(String juID) {
		this.juID = juID;
	}
	
	
	
}
