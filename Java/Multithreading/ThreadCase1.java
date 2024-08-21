// performing single task from single thread

class MyThread extends Thread{
	
	@Override
	public void run(){
		System.out.println("Thread single taks");
	}
}
class UseMyThread{
	public static void main(String args[]){
		
		MyThread th = new MyThread();
		th.start();
	}
}