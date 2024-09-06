package demo4;

public class Assign4 
{
	public static void M1()throws NullPointerException
	{
		System.out.println("inside throw method");
		throw new NullPointerException("");
	}
	public static void main(String[] args) 
	{	
		try {
			M1();
		} catch (NullPointerException e) 
		{
			System.out.println(e);
		}
	}
}
