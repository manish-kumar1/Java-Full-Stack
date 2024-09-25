package in.sp.beans;

public class Company {
	
	private String cname;
	private String ctype;
	private String location;
	private int numberofemployee;
	
	
	public Company(String cname, String ctype, String location, int numberofemployee) {
		this.cname = cname;
		this.ctype = ctype;
		this.location = location;
		this.numberofemployee = numberofemployee;
	}
	@Override
	public String toString() {
		return "Company Name: "+cname+", Company Type: "+ctype+", Location: "+location+", Number of Employee: "+numberofemployee;
	}
}
