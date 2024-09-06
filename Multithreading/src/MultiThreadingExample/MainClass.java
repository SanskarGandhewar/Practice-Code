package MultiThreadingExample;

public class MainClass 
{
	public static void main(String[] args) 
	{
		Demo1 d=new Demo1();
		d.start();
		
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName());
		}
	}
}
