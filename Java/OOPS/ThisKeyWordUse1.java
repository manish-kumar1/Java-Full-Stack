// this() keyword used to invoke current class constructor

class ThisDemo{
	
	ThisDemo(){
		System.out.println("No argument consturctor");
	}
	ThisDemo(int a){
		
		this(a, 12);  //it call the no argument thisDemo(x, x) constructor
		System.out.println("Parameterized constructor");
	}
	ThisDemo(int a, int b){
		System.out.println(a+" "+b);
	}
}
class Test{
	public static void main(String args[]){
		ThisDemo td = new ThisDemo(5);
	}
}