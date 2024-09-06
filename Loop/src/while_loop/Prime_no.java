package while_loop;

import java.util.Scanner;

public class Prime_no 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:- ");
		int x=sc.nextInt();
		int count=0;
		int i=1;
		while(i<=x)							
		{
			if(x%i==0)						
			{
				count++;
			}
			i++;
		}
		if(count==2)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("Not Prime");
		}
		
		
		
	}
}
