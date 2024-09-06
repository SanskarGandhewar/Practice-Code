package demo2;

public class BThread extends Thread
{
	@Override
	public void run()
	{
		try {
			System.out.println("Thread"+Thread.currentThread().getName()+"is Running");
			System.out.println("Thread"+Thread.currentThread().getId()+"is Running");
		} catch (Exception e)
		{
			System.out.println("Exception is Caught");
		}
	}
}
