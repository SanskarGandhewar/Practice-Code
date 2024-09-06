package WhileLoop;

import java.util.Scanner;

//reverse the given number
public class Demo2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		int result=0;
		int sum=0;
		
		while(num!=0)
		{
			result=num%10;
			sum=(sum*10)+result;
			num=num/10;
		}
		System.out.println(sum);
	}
}
