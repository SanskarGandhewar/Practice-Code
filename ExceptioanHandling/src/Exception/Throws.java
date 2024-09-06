package Exception;

public class Throws 
{
	static void m1()throws ArithmeticException
	{
		m2();
		
	}
	static void m2()throws ArithmeticException
	{
		m3();
	}
	static void m3()throws ArithmeticException
	{
		System.out.println(24/0);
	}
	public static void main(String[] args) 
	{
		try{
			m1();
		}
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
	}
}