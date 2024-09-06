package MultiThreadingExample;

public class Demo1 extends Thread
{
	public void run() 
	{	
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName());
		}
	}
}