package demo3;

public class Assign3
{
	public static void main(String[] args) 
	{
		int a[]= {12,56,78,34,11};
		try 
		{	
			System.out.println("First statement in try block");
			int result=a[4]/0;
			System.out.println(result);
		} 
		catch (ArithmeticException e) 
		{
			System.out.println(e);
		}
		catch (IndexOutOfBoundsException e) 
		{
			System.out.println(e);
		}
		catch (NullPointerException e) 
		{
			System.out.println(e);
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
		
	}
}
