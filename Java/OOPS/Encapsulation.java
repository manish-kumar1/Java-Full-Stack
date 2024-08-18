class Company{
	private int empid;
	public void setEmpId(int eid){
		this.empid = eid;
	}
	public int getEmpId(){
		return empid;
	}
}
class UseCompany{
	public static void main(String args[]){
		Company c = new Company();
		c.setEmpId(230);
		System.out.println(c.getEmpId());
	}
}