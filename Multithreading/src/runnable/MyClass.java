package runnable;

public class MyClass 
{
	public static void main(String[] args) 
	{
		ThreadDemo t=new ThreadDemo();
		Thread thread=new Thread(t);
		thread.setPriority(2);
		thread.setName("First name");
		thread.start();
		
		ThreadDemo t1=new ThreadDemo();
		Thread thread1=new Thread(t1);
		thread1.setPriority(10);
		thread1.setName("Second name");
		thread1.start();
		
		
	}
}
