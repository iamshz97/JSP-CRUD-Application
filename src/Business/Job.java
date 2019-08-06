package Business;

public class Job {

	public String jID;
	public String jobName;
	
	public Job() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Job(String jID, String jobName) {
		super();
		this.jID = jID;
		this.jobName = jobName;
	}
	public String getjID() {
		return jID;
	}
	public void setjID(String jID) {
		this.jID = jID;
	}
	public String getJobName() {
		return jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	
	
	
	
}
