package demo7;

import java.util.Scanner;

public class Revese_ReplaceFromA_To_b 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Size of an Array: ");
		int size=sc.nextInt();
		
		int a[]=new int [size];
		
		System.out.print("Enter a Element for Array A: ");
		for (int i = 0; i < a.length; i++)
		{
			a[i]=sc.nextInt();
		}

			
		System.out.println("Displaying Reverse Order Array: :");
		for (int i = a.length-1; i >= 0; i--)
		{
			System.out.print(a[i]+" ");
		}
		
		}
}
