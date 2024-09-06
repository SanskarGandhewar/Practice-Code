package WhileLoop;

import java.util.Scanner;

//Addition of given digit
public class Demo1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Choice number :");
		int num=sc.nextInt();
		int sum=0;
		int rem=0;
		while(num!=0)
		{
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println("Addition of given digit number: "+sum);
	}
}
