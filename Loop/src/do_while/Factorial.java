package do_while;

import java.util.Scanner;

public class Factorial 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:- ");
		int num=sc.nextInt();
		int i=1;
		int fact=1;
		do 
		{
			fact =fact*i;
			i++;
		}while(i<=num);
		System.out.println(fact);
	}
}
