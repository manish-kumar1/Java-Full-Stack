
class Demo extends Thread{
	
	static Thread mainthread;
	@Override
	public void run(){
		try{
			mainthread.join(); // throws InterruptedException
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
		for(int i = 1; i <= 5; i++){
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+" - "+i);
		}
	}
}
class UseDemo {
	public static void main(String args[]){
		
		Demo.mainthread = Thread.currentThread();
		
		Demo thread = new Demo();
		thread.start();
		
		for(int i = 1; i <= 5; i++){
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+" - "+i);
		}
	}
}