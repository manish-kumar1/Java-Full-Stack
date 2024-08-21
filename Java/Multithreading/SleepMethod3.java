/*
Example 2: when sleep time is negative
*/
public class SleepExp2 extends Thread  
{    
	@Override
    public void run()  
    {    
        for(int i=1;i<5;i++)  
        {    
            try  
            {  
                Thread.sleep(-500); // sleep time is negative  
            }
			catch(InterruptedException e){
				System.out.println(e);
			}    
            System.out.println(i);    
        }    
    }    
    public static void main(String args[])  
    {    
        SleepExp2 t1=new SleepExp2();    
        SleepExp2 t2=new SleepExp2();    
        t1.start();    
        t2.start();    
    }    
}  
/*
Test it Now
Output:

Exception in thread "Thread-0" Exception in thread "Thread-1" java.lang.IllegalArgumentException: timeout value is negative
	at java.lang.Thread.sleep(Native Method)
	at SleepExp2.run(SleepExp2.java:9)
java.lang.IllegalArgumentException: timeout value is negative
	at java.lang.Thread.sleep(Native Method)
	at SleepExp2.run(SleepExp2.java:9)
*/