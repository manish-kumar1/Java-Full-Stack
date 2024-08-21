// Thread creating using Runnable class 

class Test implements Runnable{
	
	@Override
	public void run(){
		System.out.println("Thread Task");
	}
	public static void main(String args[]){
		Test t = new Test();
		Thread th = new Thread(t);
		th.start();
		// th.start();  Exception: IllegalThreadStateException because of thread gone dead state
	}
}