package demo;

public class Operation 
{
	void division(int num,int demo)
	{
		//double div=num/demo;
		
		if(demo==0)
		{
			try
			{
				throw new ArithmeticDemoExcepion();
			}
			catch(ArithmeticDemoExcepion e)
			{
				System.out.println("/by zero");
			}
		}
		else
		{
			System.out.println(num/demo);
		}
	}
}
