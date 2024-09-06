package Array_2D;

public class PrimeNumberIn2D 
{
	public static void main(String[] args)
	{
		int a[][]= {{56,78,84},{13,21,33},{14,65,97}};
//		
		System.out.println("Display Prime Number in Array: ");
		
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a.length; j++)
			{
				if(a[i][j]%2==0)
				{
					System.out.println(a[i][j]+ ": is even number ");
				}
				else
				{
					System.out.println(a[i][j]+ ": is odd number ");
				}
				
			}
			
		}
		
	}
}
