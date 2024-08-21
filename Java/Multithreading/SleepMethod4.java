
class Test extends Thread{
	
	@Override
	public void run(){
		
		for(int i = 1; i <= 5; i++){
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
			System.out.println(i+" : "+Thread.currentThread().getName());
		}
	}
}
class UseTest{
	public static void main(String args[]){
		
		Test t = new Test();
		t.start();
		
		Test t1 = new Test();
		t1.start();
	}
}