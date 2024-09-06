package demo2;

import java.util.Scanner;

public class MyClass
{
	public void m1() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Size of an Array: ");
		int size=sc.nextInt();
		
		int a[]=new int [size];
		
		System.out.println("Enter integer number: ");
		for (int i = 0; i < a.length; i++) 
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Displaying Array: ");
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println(a[i]);
		}
	} 
	public static void main(String[] args) 
	{
		MyClass m = new MyClass();
		m.m1();
		
		
	}
}
