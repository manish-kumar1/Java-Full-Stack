/*
2) Java final method
If you make any method as final, you cannot override it.

Example of final method
*/

class Bike{  
	final void run(){
		System.out.println("running");
	}  
}  
class Honda extends Bike{  
	void run(){
	   System.out.println("running safely with 100kmph");
	}  
     
	public static void main(String args[]){  
		Honda honda= new Honda();  
		honda.run();  
	}  
}  