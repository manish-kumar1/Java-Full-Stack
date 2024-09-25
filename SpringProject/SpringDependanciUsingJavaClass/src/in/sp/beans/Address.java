package in.sp.beans;

public class Address {
	private int houseno;
	private String city;
	private String pincode;
	
	public void setHouseno(int houseno) {
		this.houseno = houseno;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	@Override
	public String toString() {
		return "house no: "+houseno+", city: "+city+", pincode: "+pincode;
	}
}
