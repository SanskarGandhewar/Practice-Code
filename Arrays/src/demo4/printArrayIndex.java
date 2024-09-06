package demo4;

import java.util.Scanner;

public class printArrayIndex 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Length of an Array: ");
		int size=sc.nextInt();
		
		int a[]=new int [size];
		
		System.out.println("Enter a Integer number to the Array: ");
		for (int i = 0; i < a.length; i++) 
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Displaying Data: ");
		for (int i = 0; i < a.length; i++)
		{
			System.out.println("Index "+i+" there is Element "+a[i]);
		}
	}
}
