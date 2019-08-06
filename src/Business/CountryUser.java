package Business;

public class CountryUser extends Country {
	private String cuID;

	

	public CountryUser() {
		super();
		// TODO Auto-generated constructor stub
	}


	

	public CountryUser(String cuID,String cID, String countryCode) {
		super(cID, countryCode);this.cuID = cuID;
		// TODO Auto-generated constructor stub
	}




	public String getCuID() {
		return cuID;
	}




	public void setCuID(String cuID) {
		this.cuID = cuID;
	}
	
	
	
	
	
}
