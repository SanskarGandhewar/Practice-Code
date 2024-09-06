package Array_2D;

import java.util.Scanner;

public class SubstractionOfTwoMartrix 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a Number of Rows for Array1: ");
		int row1=sc.nextInt();
		
		System.out.println("Enter a Number of columns for Array1:");
		int col1=sc.nextInt();
	
		System.out.println("Enter a Number of Rows for Array2 : ");
		int row2=sc.nextInt();
		
		System.out.println("Enter a Number of columns for Array2:");
		int col2=sc.nextInt();
		
		int a[][]=new int [row1][col1];
		
		int b[][]=new int [row2][col2];
		
		int c[][]=new int [a.length][a.length];
		
		System.out.println("Enter Element to First Array : ");
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a.length; j++)
			{	
				a[i][j]=sc.nextInt();			}
		}
		
		System.out.println("Enter Element to Second Array : ");
		for (int i = 0; i < b.length; i++)
		{
			for (int j = 0; j < b.length; j++) 
			{
				b[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Display The First Array: ");
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a.length; j++) 
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Display The Second Array: ");
		for (int i = 0; i < b.length; i++)
		{
			for (int j = 0; j < b.length; j++) 
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Addition of Two Matrix :");
		for (int i = 0; i < c.length; i++) 
		{
			for (int j = 0; j < c.length; j++) 
			{
				c[i][j]=a[i][j]-b[i][j];
			}
		}
		
		System.out.println("Matrix c: ");
		for (int i = 0; i < c.length; i++)
		{
			for (int j = 0; j < c.length; j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}
}
