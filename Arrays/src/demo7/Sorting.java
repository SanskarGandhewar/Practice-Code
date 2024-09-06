package demo7;

import java.util.Scanner;

public class Sorting 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Size of an Array: ");
		int size=sc.nextInt();
		
		int a[]=new int [size];
		
		System.out.println("Enter Element for Array: ");
		for (int i = 0; i < a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		for (int i = 0; i < a.length; i++)
		{
			for (int j = i+1; j < a.length; j++)
			{
				if (a[j]<a[i])
				{
					int temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
		System.out.print("Displaying Sorted Array: ");
		for (int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+ ",");
		}
	}
}
