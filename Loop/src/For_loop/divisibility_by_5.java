package For_loop;

import java.util.Scanner;

public class divisibility_by_5 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:- ");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			if(i%5==0)
			{
				System.out.println(i+" :- Divisible by 5 ");
			}
			else
			{
				System.out.println(i+" :- not divisible by 5 ");
			}
		}
	}
}
