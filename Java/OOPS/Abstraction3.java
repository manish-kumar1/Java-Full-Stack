abstract class Bike{
	Bike(){
		System.out.println("Bike is Created");
	}
	abstract void run();
	void changeGear(){
		System.out.println("Gear changed Successfully");
	}
}
class Honda extends Bike{
	void run(){
		System.out.println("running safely..");
	}
	public static void main(String args[]){
		Bike b = new Honda();
		b.changeGear();
		b.run();
	}
}
