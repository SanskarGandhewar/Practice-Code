package conditionalControlStatement;

import java.util.Scanner;

public class ifelseifExample 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n1=sc.nextInt();
		
		if(n1<0)
		{
			System.out.println("The Given Number Is Negative");
		}
		else if(n1>0)
		{
			System.out.println("The Given Number Is Positive");
		}
		else
		{
			System.out.println("The Number is Ze0ro");
		}
	}
}
