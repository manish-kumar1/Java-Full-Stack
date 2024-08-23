
class Test extends Thread{
	@Override
	public void run(){
		
		try{
			for(int i = 1; i <= 5; i++){
				System.out.println(Thread.currentThread().getName()+" - "+i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException ex){
			ex.printStackTrace();
		}
		
	}
}
class UseTest{
	public static void main(String argsp[]){
		Test t = new Test();
		t.start();
		
		t.interrupt();
	}
}