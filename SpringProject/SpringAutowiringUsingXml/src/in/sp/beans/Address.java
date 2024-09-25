package in.sp.beans;

public class Address {
	
	private int houseno;
	private String city;
	private String district;
	public int getHouseno() {
		return houseno;
	}
	public void setHouseno(int houseno) {
		this.houseno = houseno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	
	@Override
	public String toString() {
		return "House No: "+houseno+", City: "+city+", District: "+district;
	}
	
}
