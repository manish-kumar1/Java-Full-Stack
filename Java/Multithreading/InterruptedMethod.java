
class Demo extends Thread{
	
	@Override
	public void run(){
		//System.out.println("A: "+Thread.interrupted()); // true->false (false is interrupted status)
		//System.out.println("A: "+Thread.interrupted()); // false->true (true is interrupted status)
		System.out.println("B1: "+Thread.currentThread().isInterrupted()); // true->true (true is interrupted status)
		System.out.println("B1: "+Thread.currentThread().isInterrupted()); // true->true (true is interrupted status)
		try{
			for(int i = 1; i <= 5; i++){
				System.out.println(i);
				Thread.sleep(1000);
				System.out.println("B: "+Thread.interrupted());
			}
		}
		catch(InterruptedException ex){
			ex.printStackTrace();
		}
	}
	
}
class UseDemo extends Thread{
	public static void main(String argsp[]){
		Demo thread = new Demo();
		thread.start();
		
		thread.interrupt();
	}
}