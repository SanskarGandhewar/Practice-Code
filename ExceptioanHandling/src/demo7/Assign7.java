package demo7;

public class Assign7 
{
	public void checkEligibilti(int age ,int weight)throws ArithmeticException
	{
		if(age<12 || weight<40)
		{
			throw new ArithmeticException("Student is not eligible for registeration");
		}
		else
		{
			System.out.println("Entry valid ");
		}
	}
}
