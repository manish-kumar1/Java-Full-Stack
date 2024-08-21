// Way 2
// Creating thread using Runnable interface

class ThreadUsingInterface implements Runnable {

    // Method 1
    // run() method for the thread
    public void run()
    {

        // Print statement
        System.out.println(&quot;Thread is created using Runnable interface&quot;);
    }

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
