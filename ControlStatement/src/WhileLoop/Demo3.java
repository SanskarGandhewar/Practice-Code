package WhileLoop;

import java.util.Scanner;

//Palindrome number
public class Demo3 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num=sc.nextInt();
		int temp=num;
		int result=0;
		int sum=0;
		while(num!=0) 
		{
			result=num%10;
			sum=sum*10+result;
			num=num/10;
		}
		if(temp==sum)
		{
			System.out.println("The Given number is palindrome");
		}
		else
		{
			System.out.println("THe Given Number is Not Palindrome");
		}
	}
}
