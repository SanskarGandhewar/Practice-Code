package WhileLoop;

import java.util.Scanner;
//Armstrong number
public class Demo4 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		double sum=0;
		int count=0;
		int result=0;
		int temp=num;
		while(num!=0) 
		{
			num=num/10;							//n=15,1,0
			count++;							//c=1,2,3
		}
		
		num=temp;								//n=153
		while(num!=0);
		{
			result=num%10;						//r=3,5,1
			sum=sum+ Math.pow(result, count);	//s=27+125+1
			num=num/10;							//15,1,0
		}		
		
		if(sum==temp)
		{
			System.out.println("The Given Number is Armstrong Number");
		}
		else
		{
			System.out.println("The Given Number is not An Armstrong Number");
		}
	}
}
