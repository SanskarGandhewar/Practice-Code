package Array_2D;

public class MinNumberIn2D 
{
	public static void main(String[] args) 
	{
		int a[][]= {{44,57,84},{45,24,85,},{14,65,97}};
//		
		System.out.println("Display Min Number: ");
		int min=100;
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a.length; j++)
			{
				if(a[i][j]<min)
				{
					min=a[i][j];
				}
			}
		}
		System.out.println("Max: "+min);
	}
}
