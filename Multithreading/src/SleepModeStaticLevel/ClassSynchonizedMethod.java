package SleepModeStaticLevel;

public class ClassSynchonizedMethod
{
	synchronized static void showMessage()
	{
		System.out.println(Thread.currentThread().getName()+" : says Hello");
	}
}
