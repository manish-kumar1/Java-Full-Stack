// Naming Threads
// used these methods getName(), setName(), currentThread()

class Test{
	public static void main(String args[]){
		
		System.out.println("Hello Thread");
		
		System.out.println(Thread.currentThread().getName());
		
		Thread.currentThread().setName("Mister");
		
		System.out.println("new thread: "+Thread.currentThread().getName());
		
		System.out.println(10/0);
	}
}