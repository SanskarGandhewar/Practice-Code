package demo7;

import java.util.Scanner;
//Transfer the array element from A to B
public class RepalceFromA_To_B 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Length of an Array: ");
		int size=sc.nextInt();
		
		int a[]=new int [size];
		int b[]=new int [a.length];
		
		System.out.println("Enter Element for Array A: ");
		for (int i = 0; i < a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		for (int i = 0; i < a.length; i++) 
		{
			b[i]=a[i];
		}
		System.out.println("Displaying Element for Array B: ");
		for (int i = 0; i < b.length; i++)
		{
			System.out.println(b[i]);
		}
		
	}
}
