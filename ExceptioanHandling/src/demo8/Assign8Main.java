package demo8;

public class Assign8Main 
{
	public static void main(String[] args) 
	{
		Assign8 a = new Assign8();
		try {
			
			System.out.println(a.division(15, 5));
			
			
			System.out.println(a.StringLength(""));
			
		} 
		catch (DivisionByZeroException e)
		{
			System.out.println(e.getMessage());
		}
		catch (NullStringException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
