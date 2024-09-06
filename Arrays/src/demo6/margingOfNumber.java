package demo6;

import java.util.Scanner;

public class margingOfNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Length of an Array: ");
		int size=sc.nextInt();
		
		int a[]=new int [size];
		
		System.out.println("Enter a Number: ");
		for (int i = 0; i < a.length; i++)
		{
			a[i]=sc.nextInt();
			
		}
		
		System.out.println("Displaying number: ");
		for (int i = 0; i < a.length; i++)
		{
			
			if(a[i]%2==0)
			{
				System.out.println(a[i]+ " is an Even Number");
			}
			else
			{
				System.out.println(a[i]+ " is an Odd Number");
			}
			
		}
		
		
	}
}
