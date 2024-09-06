package demo1;

public class Excep1 
{
	public static void main(String[] args) 
	{
		int a;
		int b;
		try
		{
			a=22;
			b=0;
			int c=a/b;
		}catch (Exception e)
		{
			System.out.println("can't be divide by "+e.getMessage());
		}
	}
}
