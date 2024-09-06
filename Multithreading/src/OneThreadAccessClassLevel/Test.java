package OneThreadAccessClassLevel;

public class Test 
{
	synchronized static void displayMessage()
	{
		System.out.println(Thread.currentThread().getName()+": Says Good Morning");
	}
}
