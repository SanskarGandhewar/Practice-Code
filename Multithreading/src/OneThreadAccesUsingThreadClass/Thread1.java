package OneThreadAccesUsingThreadClass;

public class Thread1 extends Thread
{
	@Override
	public void run() 
	{
		for(int i=0;i<5;i++)
		{
			ClassSynchonizedMethod.showMessage();
		}
	}
}
