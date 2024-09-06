package SleepModeStaticLevel;
public class Thread2 extends Thread
{
	@Override
	public void run() 
	{
		for (int i = 0; i < 5; i++)
		{
			try {
				Thread.sleep(2000);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			ClassSynchonizedMethod.showMessage();
		}
	}

}
