class ThisDemo{
	void display(){
		System.out.println("Hello");
	}
	void show(){
		this.display(); // display(); both same
	}
	public static void main(String args[]){
		ThisDemo d = new ThisDemo();
		d.show();
	}
}