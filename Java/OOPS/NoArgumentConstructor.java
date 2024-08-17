class NoArgumentConstructor{
	String empName;
	int empAge;
	NoArgumentConstructor(){
		System.out.println("No argument Constructor");
	}
	public static void main(String args[]){
		NoArgumentConstructor obj = new NoArgumentConstructor();
	}
}