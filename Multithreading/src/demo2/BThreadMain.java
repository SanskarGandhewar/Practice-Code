package demo2;

public class BThreadMain 
{
	public static void main(String[] args) 
	{
		for (int i = 0; i <=8; i++)
		{
			BThread o = new BThread();
			o.start();
		}
	}
	
}
