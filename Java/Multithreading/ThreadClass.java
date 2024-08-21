// Thread creating using Thread class

class Test extends Thread{
	
	@Override
	public void run(){
		System.out.println("Thread task");
	}
	public static void main(String argsp[]){
		Test t = new Test();
		t.start();
	}
}