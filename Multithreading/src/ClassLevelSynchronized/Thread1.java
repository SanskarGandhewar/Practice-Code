package ClassLevelSynchronized;

public class Thread1 extends Thread
{
	@Override
	public void run() 
	{
		ClassSynchonizedMethod.showMessage();
	}
}
