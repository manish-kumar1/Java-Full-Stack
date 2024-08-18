class Karantaka{
	void show() throws RuntimeException{ 
		System.out.println("Mysore");
	}
}
class Bangalore extends Karantaka{
	void show() throws RuntimeException{
		System.out.println("BTM Layout");
	}
	public static void main(String args[]){
		Karantaka ka = new Karantaka();
		ka.show();
		
		Bangalore bg = new Bangalore();
		bg.show();
	}
}