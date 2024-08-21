// Priority has two methods getPriority()-> return the priority of thread and setPriority()-> set the priority of thread
// default priority of main method is 5
// 1 MIN_PRIORITY()
// 5 NORM_PRIORITY()
// 10 MAX_PRIORITY()
class Test implements Runnable{
	
	@Override
	public void run(){
		//Thread.currentThread().setPriority(8);
		System.out.println(Thread.currentThread().getPriority()); // 5 because jvm provide priority of caller method 
	}
}
class UseTest{
	public static void main(String args[]){
		
		Test t = new Test();
		Thread th = new Thread(t);
		//th.setPriority(3);
		th.start();
		System.out.println("default main method priority: "+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(4); // set the priority of main thread(current_Thread)
		System.out.println("new priority: "+Thread.currentThread().getPriority());
		System.out.println("main method priority: "+Thread.currentThread().getPriority());
	}
}