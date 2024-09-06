package demo9;

public class demo 
{
	public int M1(int num)
	{
		int sum=0;
		while(num!=0)
		{
			int result=num%10;
			sum=sum+result;
			num=num/10;
		}
		System.out.println("Sum of digit of number: "+sum);
		return sum;	
	}
	
	public void M2(int num)
	{
		System.out.println("Table of Given Number: "+num);
		for(int i=1;i<=10;i++)
		{
			System.out.println(+num+" * "+i+" = "+num*i);
		}
		
	}
	
	public static void main(String[] args) 
	{
		demo d = new demo();
		System.out.println("****Task-1****");
		d.M1(124);
		System.out.println();
		System.out.println("****Task-2****");
		d.M2(5);
	}
}
