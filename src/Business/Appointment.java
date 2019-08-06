package Business;

public class Appointment {
	private String appID;
	private String appDate;
	private String appTime;
	private String appStatus;
	private String consultedBy;
	private String approvedBy;
	private String bookedby;
	
	
	
	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Appointment(String appID, String appDate, String appTime, String appStatus, String consultedBy,
			String approvedBy, String bookedby) {
		super();
		this.appID = appID;
		this.appDate = appDate;
		this.appTime = appTime;
		this.appStatus = appStatus;
		this.consultedBy = consultedBy;
		this.approvedBy = approvedBy;
		this.bookedby = bookedby;
	}

	public String getAppID() {
		return appID;
	}

	public void setAppID(String appID) {
		this.appID = appID;
	}

	public String getAppDate() {
		return appDate;
	}

	public void setAppDate(String appDate) {
		this.appDate = appDate;
	}

	public String getAppTime() {
		return appTime;
	}

	public void setAppTime(String appTime) {
		this.appTime = appTime;
	}

	public String getAppStatus() {
		return appStatus;
	}

	public void setAppStatus(String appStatus) {
		this.appStatus = appStatus;
	}

	public String getConsultedBy() {
		return consultedBy;
	}

	public void setConsultedBy(String consultedBy) {
		this.consultedBy = consultedBy;
	}

	public String getApprovedBy() {
		return approvedBy;
	}

	public void setApprovedBy(String approvedBy) {
		this.approvedBy = approvedBy;
	}

	public String getBookedby() {
		return bookedby;
	}

	public void setBookedby(String bookedby) {
		this.bookedby = bookedby;
	}
	
	
	
	
	
	
}
