abstract class Vehicle{
	abstract void start();
}
class Car extends Vehicle{
	void start(){
		System.out.println("Car start with key");
	}
}
class Scotter extends Vehicle{
	void start(){
		System.out.println("Scotter start with kick");
	}
	public static void main(String args[]){
		Vehicle v = new Vehicle();
		v.start();
	}
}