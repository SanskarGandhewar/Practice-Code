package ClassLevelSynchronized;

public class Thread2 extends Thread
{
	@Override
	public void run() 
	{
			ClassSynchonizedMethod.showMessage();
	}


}
