package Business;

public class Admin {
	private String adID;
	private String firstName;
	private String lastNAme;
	private String email;
	private String nic;
	private String contact;
	
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Admin(String adID, String firstName, String lastNAme, String email, String nic, String contact) {
		super();
		this.adID = adID;
		this.firstName = firstName;
		this.lastNAme = lastNAme;
		this.email = email;
		this.nic = nic;
		this.contact = contact;
	}
	
	public String getAdID() {
		return adID;
	}
	public void setAdID(String adID) {
		this.adID = adID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastNAme() {
		return lastNAme;
	}
	public void setLastNAme(String lastNAme) {
		this.lastNAme = lastNAme;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNic() {
		return nic;
	}
	public void setNic(String nic) {
		this.nic = nic;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	
	
	
	
}
