class StaticBlock{
	static{
		System.out.println("Hello yaar");//before 1.6 java version static block excute without main method  
	}
	public static void main(String args[]){
		System.out.println("Nahi mai kahi nahi ja rah");
	}
	static{
		System.out.println("kahi chalna hai kay");
	}
	static{
		System.out.println("Theek hai");
	}
}