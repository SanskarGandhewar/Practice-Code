package demo6;

public class Assign5Main
{
	public static void main(String[] args) 
	{
		int sum=0;
		
		try
		{
			sum=Assign5.sum(5, 6);
			
		}catch (ArithmeticException e) 
		{
			System.out.println(e.getMessage());
		}
		System.out.println("Sum of Num1 and Num2 is : "+sum);
	}
}
