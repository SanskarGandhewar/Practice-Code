package ObjectLevelSynchonized;

public class Thread2 extends Thread
{
	ClassSynchonizedMethod cd;
	
	public Thread2 (ClassSynchonizedMethod cd)
	{
		this.cd=cd;
	}
	
	@Override
	public void run() 
	{
			cd.showMessage();
	}
}
