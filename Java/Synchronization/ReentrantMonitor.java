/*
Reentrant Monitor in Java
According to Sun Microsystems, Java monitors are reentrant means java thread can reuse the same monitor for different synchronized methods if method is called from the method.

Advantage of Reentrant Monitor
It eliminates the possibility of single thread deadlocking

Let's understand the java reentrant monitor by the example given below:
*/
class Reentrant  {  
    public synchronized void m() {  
    n();  
    System.out.println("this is m() method");  
    }  
    public synchronized void n() {  
    System.out.println("this is n() method");  
    }  
}
public class ReentrantExample{  
	public static void main(String args[]){  
		final ReentrantExample re=new ReentrantExample();  
  
		Thread t1=new Thread(){  
			public void run(){  
				re.m();//calling method of Reentrant class  
			}  
		};  
		t1.start();  
	}
} 
/*  
In this class, m and n are the synchronized methods. The m() method internally calls the n() method.

Now let's call the m() method on a thread. In the class given below, we are creating thread using annonymous class.
*/
