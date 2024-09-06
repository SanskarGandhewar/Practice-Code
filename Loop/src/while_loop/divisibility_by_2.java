package while_loop;

import java.util.Scanner;

public class divisibility_by_2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int x=sc.nextInt();
		
		int i=0;
		 while(i<=x) 
		{
			
			if(i%2==0)
			{
				x++;
				System.out.println(i);
				
			}
			 i++;
		}
	}
}
