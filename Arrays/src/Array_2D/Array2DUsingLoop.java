package Array_2D;

import java.util.Scanner;

public class Array2DUsingLoop
{
	//Array 2D Using Loop and Scanner Class
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number of rows : ");
		int sizerow=sc.nextInt();
		System.out.println("Enter a Number of columns : ");
		int sizecol=sc.nextInt();
		
		int a[][]=new int [sizerow][sizecol];
		
		System.out.println("Enter the elements of the array : ");
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a.length; j++) 
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Display Elements of the array are: ");
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a.length; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
