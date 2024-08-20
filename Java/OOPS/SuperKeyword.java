class Animal{  
	String color="white";  
}  
class Dog extends Animal{  

	String color="black";  
	
	void printColor(String color){ 
	
		System.out.println(color); // prints color which pass throug args //Pink
		System.out.println(this.color);//prints color of Dog class(current class) // black 
		System.out.println(super.color);//prints color of Animal class(parent class)  // white
	}  
}  
class TestSuper1{  
	public static void main(String args[]){  
		Dog d=new Dog();  
		d.printColor("Pink");  
	}
}  