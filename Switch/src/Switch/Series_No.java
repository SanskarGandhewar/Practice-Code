package Switch;

import java.util.Scanner;

public class Series_No 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("1.case : 1,2,3,4,5......");
		System.out.println("2.case : 2,4,6,8,10.....");
		System.out.println("3.case : 1,3,5,7,9......");
		System.out.println("4.case : 1,4,9,16,25....");
		System.out.println("5.case : 1,8,27,64,125..");
		System.out.print("Enter Case Number:- ");
		int num=sc.nextInt();
	
		switch(num)
		{
		case 1: 
			System.out.print("Enter a number:- ");
			int a=sc.nextInt();
			for(int i=1;i<=a;i++) 
			{
				if(a>=1)
				System.out.println(i);
			}
			break;
		case 2:
			System.out.print("Enter a Number:- ");
			int b=sc.nextInt();
			for(int i=1;i<=b;i++)
			{
				System.out.println(i*2);
			}
			break;
		case 3:
			System.out.print("Enter a number:- ");
			int c=sc.nextInt();
			for(int i=1;i<=c*2;i+=2)
			{
				System.out.println(i);
			}
			break;
		case 4:
			System.out.print("Enter a Number:- ");
			int d=sc.nextInt();
			for(int i=1;i<=d;i++)
			{
				System.out.println(i*i);
			}
			break;
		case 5:
			System.out.print("Enter a Number:- ");
			int e=sc.nextInt();
			for(int i=1;i<=e;i++)
			{
				System.out.println(i*i*i);
			}
			break;
			
		default :
			System.out.println("Enter another case ");
		}
	
	}
}