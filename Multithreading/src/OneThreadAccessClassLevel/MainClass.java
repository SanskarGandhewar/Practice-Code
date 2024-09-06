package OneThreadAccessClassLevel;
public class MainClass
{
	public static void main(String[] args) 
	{
		Demo d1 = new Demo();
		Demo d2 = new Demo();
		
		d1.setName("Thread 1");
		d2.setName("Thread 2");
		
		d1.start();
		d2.start();
	}
}
