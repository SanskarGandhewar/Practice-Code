package do_while;

import java.util.Scanner;

public class palindrome
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:- ");
		int num=sc.nextInt();
		int i=1;
		int temp=num;
		int rev=0;
		do
		{
			int result=num%10;
			rev=(rev*10)+result;
			num=num/10;
			i++;
		}while(i<=num);
		System.out.print(rev);
		if(temp==rev)
		{
			System.out.println(" is a Palindrome");
		}
		else
		{
			System.out.println(" Not a Palindrome");
		}
	}
}
