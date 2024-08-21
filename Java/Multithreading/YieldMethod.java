// yield()-> which stop the current executing thread and give a chance to other threads for executing

class Test implements Runnable{
	
	@Override
	public void run(){
		//Thread.yield();
		for(int i = 1; i <= 5; i++){
			System.out.println(Thread.currentThread().getName()+" - " +i);
		}
	}
}
class UseTest{
	public static void main(String argsp[]){
		
		Test t = new Test();
		Thread th = new Thread(t);
		th.start();
		
		Thread.yield();
		for(int i = 1; i <= 5; i++){
			System.out.println(Thread.currentThread().getName()+" - " +i);
		}
	}
}