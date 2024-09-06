package ObjectLevelSynchonized;

public class Thread1 extends Thread
{
	ClassSynchonizedMethod cd;
	
	public Thread1 (ClassSynchonizedMethod cd)
	{
		this.cd=cd;
	}
	
	@Override
	public void run() 
	{
			cd.showMessage();
	}
}
