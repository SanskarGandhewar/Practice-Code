package Exception;

public class Demo1 
{
	public static void main(String[] args)
	{
		String num="Sanskar";
		int s=58;
		int g=0;
		int a[]= {0,1,2,3,4,5};
		
		try {
			System.out.println(num.length());
			System.out.println(a[4]);
			System.out.println(s/g);
		}
		catch(NullPointerException|ArithmeticException|ArrayIndexOutOfBoundsException ar)
		{
			System.out.println(ar.getMessage());
		}
	}
}
