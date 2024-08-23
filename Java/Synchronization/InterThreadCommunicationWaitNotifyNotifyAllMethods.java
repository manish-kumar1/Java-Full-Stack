
class TotalEarnings extends Thread{
	
	int total = 0;
	@Override
	public void run(){
		synchronized(this){
			for(int i = 1; i <= 10; i++){
				total = total + 100;
			}
			this.notify();
		}
	}
}
class MovieBook{
	public static void main(String argsp[]) throws InterruptedException{
		
		TotalEarnings te = new TotalEarnings() ;
		te.start();
		
		//te.join();
		//System.out.println("Total Earnings "+te.total); // 0
		
		synchronized(te){
			te.wait();
			System.out.println("Total Earnings "+te.total);
		}
	}
}