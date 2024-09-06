package Exception;

public class Demo
{
	public static void main(String[] args) 
	{
		String num=null;
		try
		{
			System.out.println(num.length());
		}
		catch (Exception e) {
			System.out.println("provide another number");
		}		
		
		int a[]= {1,2,3,4,5};
		try {
			System.out.println(a.length);
			}
		catch (Exception e) {
			System.out.println();
		}
	}
}
