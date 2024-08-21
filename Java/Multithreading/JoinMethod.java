/*
join()-> The join() method of thread class waits for a thread to die. 
It is used when you want one thread to wait for completion of another. 
This process is like a relay race where the second runner waits until the first runner comes and hand over the flag to him.
*/

class Test extends Thread{
	
	@Override
	public void run(){
		
		try{
			for(int i = 1; i <= 5; i++){
				System.out.println(Thread.currentThread().getName()+" - "+i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
class UseTest{
	public static void main(String args[])throws InterruptedException{
		Test t = new Test();
		t.start();
		
		t.join();
		try{
			for(int i = 1; i <= 5; i++){
				System.out.println(Thread.currentThread().getName()+" - "+i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
