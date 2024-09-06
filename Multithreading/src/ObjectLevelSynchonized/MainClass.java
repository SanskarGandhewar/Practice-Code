package ObjectLevelSynchonized;

public class MainClass 
{
	public static void main(String[] args) 
	{
		ClassSynchonizedMethod cd = new ClassSynchonizedMethod();
		
		Thread1 th1 = new Thread1(cd);
		Thread2 th2 = new Thread2(cd);
		
		th1.setName("Thread 1");
		th2.setName("Thread 2");
		
		th1.start();
		th2.start();
	}
}
