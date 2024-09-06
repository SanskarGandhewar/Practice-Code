package conditionalControlStatement;

import java.util.Scanner;

//Smallest number Between two Number
public class ifExample 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number Choice:");
		int n1=sc.nextInt();
		
		System.out.println("Enter First Number Choice:");
		int n2=sc.nextInt();
		
		if(n1>n2)
		{
			System.out.println(n1+ " is greater than " +n2);
		}
		if(n2>n1)
		{
			System.out.println(n2+ " is greater than "+n1);
		}
		
		
	}
}
