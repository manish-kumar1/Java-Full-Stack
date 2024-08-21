// sleep()-> The sleep() method of thread class is used to sleep a thread for the specified amount of time.

class SleepMethod extends Thread{
	
	@Override
	public void run(){
		for(int i = 1; i <= 5; i++){
			try{
				SleepMethod.sleep(500);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
}
class UseSleepMethod{
	public static void main(String args[]){
		
		SleepMethod thread = new SleepMethod();
		thread.start();
		
		SleepMethod thread1 = new SleepMethod();
		thread1.start();
	}
}