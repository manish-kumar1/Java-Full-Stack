package ci.dependent.object;

public class Address {

	private String city;
	private String pincode;
	private String State;
	
	public Address(String city, String pincode, String state) {
		super();
		this.city = city;
		this.pincode = pincode;
		State = state;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", pincode=" + pincode + ", State=" + State + "]";
	}
	
	
}
