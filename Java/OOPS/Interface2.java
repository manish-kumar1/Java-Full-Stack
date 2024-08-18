interface Bank{
	public abstract float getRateOfInterest();
}
class SBI implements Bank{
	public float getRateOfInterest(){
		return 8.5f;
	}
}
class PNB implements Bank{
	public float getRateOfInterest(){
		return 7.5f;
	}
}
class HDFC implements Bank{
	public float getRateOfInterest(){
		return 6.5f;
	}
}
class UseBank{
	public static void main(String args[]){
		SBI s = new SBI();
		System.out.println("SBI ROI is: "+s.getRateOfInterest()+"%");
		PNB p = new PNB();
		System.out.println("PNB ROI is: "+p.getRateOfInterest()+"%");
		HDFC h = new HDFC();
		System.out.println("HDFC ROI is: "+h.getRateOfInterest()+"%");
	}
}
		