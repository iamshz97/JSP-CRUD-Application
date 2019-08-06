package Business;

public class Country {

	public String cID;
	public String countryCode;
	
	public Country() {
		
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Country(String cID, String countryCode) {
		super();
		this.cID = cID;
		this.countryCode = countryCode;
	}


	public String getcID() {
		return cID;
	}


	public void setcID(String cID) {
		this.cID = cID;
	}


	public String getCountryCode() {
		return countryCode;
	}


	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	
	
	
	}
