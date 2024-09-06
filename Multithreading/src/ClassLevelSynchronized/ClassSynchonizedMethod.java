package ClassLevelSynchronized;

public class ClassSynchonizedMethod 
{
	synchronized static void showMessage()
	{
		for (int i = 0; i <= 5; i++) 
		{
				System.out.println(Thread.currentThread().getName()+" : says Hello");
		}
	}
}
