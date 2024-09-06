package demo6;

public class Assign5 
{
	public static int sum(int num1,int num2)throws ArithmeticException
	{
		if(num1==0) 
		{
			throw new ArithmeticException("First arg is not valid");
		}
		else
		{
			System.out.println("both are correct");
		}
		return num1 + num2;
		
	}
}
