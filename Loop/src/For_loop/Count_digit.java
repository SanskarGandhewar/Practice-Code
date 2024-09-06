package For_loop;

import java.util.Scanner;

public class Count_digit 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:- ");
		int num=sc.nextInt();
		int count=0;
		for(int i=1;num!=0;i++)
		{
			int result=num%10;
			count++;
			num=num/10;
			
		}System.out.println("Count:- "+count);
	}
}
