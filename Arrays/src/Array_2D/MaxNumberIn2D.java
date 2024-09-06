package Array_2D;

//import java.util.Scanner;

public class MaxNumberIn2D
{
	public static void main(String[] args) 
	{
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter a number of row: ");
//		int row=sc.nextInt();
//		
//		System.out.println("Enter a Number of Columns: ");
//		int col=sc.nextInt();
		
//		int a[][]=new int [row][col];
//		
//		System.out.println("Enter a Element for Array: ");
//		for (int i = 0; i < a.length; i++)
//		{
//			for (int j = 0; j < a.length; j++)
//			{
//				a[i][j]=sc.nextInt();
//			}
//		}
		int a[][]= {{44,57,84},{45,24,85,},{14,65,97}};
//		
		System.out.println("Display Max Number: ");
		int max=0;
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a.length; j++)
			{
				if(a[i][j]>max)
				{
					max=a[i][j];
				}
			}
		}
		System.out.println("Max: "+max);	
	}
}
