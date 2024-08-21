// currentThread(), setName(), getName(), isAlive()

class Test extends Thread{
	
	@Override
	public void run(){
		System.out.println("Test.run method excuted by: "+Thread.currentThread().getName());
	}
}
class Test1 extends Thread{
	
	@Override
	public void run(){
		Thread.currentThread().setName("Mister");
		System.out.println("Test1.run method excuted by: "+Thread.currentThread().getName());
	}
}
class UseTest{
	public static void main(String argsp[]){
		
		Test t = new Test();
		t.start();
		
		//System.out.println("main method excuted by: "+Thread.currentThread().getName());
		
		Test1 t1 = new Test1();
		//t1.setName("Mister");  set the name of thread
		t1.start();
		System.out.println(t1.isAlive());
		
		System.out.println(Thread.currentThread().isAlive()); // true
	}
}