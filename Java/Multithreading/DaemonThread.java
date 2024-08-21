// Daemon Thread has two methods isDaemon()- return true or false, setDaemon()-converting user thread to Daemon thread
class Test extends Thread{
	
	@Override
	public void run(){
		
		if(Thread.currentThread().isDaemon()){
			System.out.println("Daemon Thread");
		}
		else{
			System.out.println("Not Daemon Thread");
		}
	}
}
class UseTest{
	public static void main(String args[]){
		
		// Thread.currentThread().setDaemon(true); Exception: IllegalThreadStateException
		System.out.println("Hello");
		Test t = new Test();
		t.setDaemon(true);  // we can provide true or false
		t.start();
		//t.setDaemon(true);  Exception: IllegalThreadStateException
	}
}