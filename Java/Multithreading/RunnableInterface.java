// Way 2
//1. Creating thread using Runnable interface
//2. Ceating thread using Thread class

class ThreadUsingInterface implements Runnable {

    // run() method for the thread
    public void run()
    {
        // Print statement
        System.out.println("Thread is created using Runnable interface");
    }  
}
class UseThreadUsingInterface{
	// Method 2
    // Main driver method
	public static void main(String[] args)
    {

        // Creating object of our thread class inside main()
        // method
        ThreadUsingInterface obj = new ThreadUsingInterface();
      
        // Passing the object to thread in main()
        Thread myThread = new Thread(obj);
      
        // Starting the thread
        myThread.start();
    }
}