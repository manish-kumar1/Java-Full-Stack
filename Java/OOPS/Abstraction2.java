abstract class Bank{
	abstract int getRateOfInterest();
}
class SBI extends Bank{
	int getRateOfInterest(){
		return 8;
	}
}
class PNB extends Bank{
	int getRateOfInterest(){
		return 7;
	}
}
class HDFC extends Bank{
	int getRateOfInterest(){
		return 6;
	}
}
class UseBank{
	public static void main(String argsp[]){
		Bank b;
		b = new SBI();
		System.out.println("SBI Rate of interest is: "+b.getRateOfInterest()+"%");
		b = new PNB();
		System.out.println("PNB Rate of Interest is: "+b.getRateOfInterest()+"%");
		b = new HDFC();
		System.out.println("HDFC Rate of Interest is: "+b.getRateOfInterest()+"%");
	}
}