// performing multiple task from multiple thread

class MyThread1 extends Thread{
	
	@Override
	public void run(){
		System.out.println("task 1");
	}
}
class MyThread2 extends Thread{
	
	@Override
	public void run(){
		System.out.println("task 2");
	}
}
class MyThread3 extends Thread{
	
	@Override
	public void run(){
		System.out.println("task 3");
	}
}
class Test{
	public static void main(String args[]){
		
		MyThread1 thread1 = new MyThread1();
		thread1.start();
		
		MyThread2 thread2 = new MyThread2();
		thread2.start();
		
		MyThread3 thread3 = new MyThread3();
		thread3.start();
	}
}