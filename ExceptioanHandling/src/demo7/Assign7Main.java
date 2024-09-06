package demo7;

public class Assign7Main 
{
	public static void main(String[] args) 
	{
		Assign7 a = new Assign7();
		try 
		{
			a.checkEligibilti(12, 30);
		} 
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("Have a Nice day");
	}
}
