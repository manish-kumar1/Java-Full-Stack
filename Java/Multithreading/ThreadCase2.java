// performing single task from multiple thread

class Test extends Thread{
	
	@Override
	public void run(){
		System.out.println("single task");
	}
}
class UseTest{
	public static void main(String args[]){
		
		Test t = new Test(); // thread 1
		t.start();
		
		Test t1 = new Test();  // thread 2
		t1.start();
		
		Test t2 = new Test();  // thread 3
		t2.start();
	}
}