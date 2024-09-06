package OneThreadAccessClassLevel;

public class Demo extends Thread 
{
	public void run() 
	{
		for(int i=0;i<5;i++)
		{
			Test.displayMessage();
		}
	}
}
