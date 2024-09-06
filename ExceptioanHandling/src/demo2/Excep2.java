package demo2;

public class Excep2 
{
	public static void main(String[] args) 
	{
		int a[]= {56,99,12,10,45};
		try
		{
			System.out.println(a[6]);
		} catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
		
		
	}
}
