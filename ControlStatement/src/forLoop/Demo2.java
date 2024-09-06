package forLoop;

import java.util.Scanner;

//check given number is prime or not
public class Demo2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		int count=0;
		
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("The Given Number is Prime number ");
		}
		else
		{
			System.out.println("The Given Number is not a Prime Number");
		}
	}
}
