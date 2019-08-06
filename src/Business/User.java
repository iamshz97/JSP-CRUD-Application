package Business;

public class User {
	
	private String userID;
	private String firstName;
	private String lastName;
	private String email;
	private String DOB;
	private String gender;
	private String uName;
	private String pWord;
	private String uType;
	private String uStatus;
		
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(String userID, String firstName, String lastName, String email, String dOB, String gender, String uName,
			String pWord, String uType, String uStatus) {
		super();
		this.userID = userID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		DOB = dOB;
		this.gender = gender;
		this.uName = uName;
		this.pWord = pWord;
		this.uType = uType;
		this.uStatus = uStatus;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getpWord() {
		return pWord;
	}
	public void setpWord(String pWord) {
		this.pWord = pWord;
	}
	public String getuType() {
		return uType;
	}
	public void setuType(String uType) {
		this.uType = uType;
	}
	public String getuStatus() {
		return uStatus;
	}
	public void setuStatus(String uStatus) {
		this.uStatus = uStatus;
	}
	
	
	
	

	
	
}
