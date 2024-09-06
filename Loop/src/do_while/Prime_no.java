package do_while;

import java.util.Scanner;

public class Prime_no 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number");
		int x=sc.nextInt();
		int count=0;
		int i=1;
		do {
			if(x%i==0)
			{
				count++;
			}i++;
		}while(i<=x);
		if(count==2)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("not prime");
		}
	}
}
