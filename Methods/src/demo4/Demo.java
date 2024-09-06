package demo4;

public class Demo 
{
	public static void Sub() 
	{
		int num1=15;
		int num2=4;
		int sum=num1-num2;
		System.out.println("The Substraction of number is: "+sum);
	}
	
	public static void Mul(int x, int y)
	{
		int sum=x*y;
		System.out.println("The Multiplication of number is : "+sum);
	}
	
	public static void main(String[] args)
	{
		Sub();
		Mul(5, 4);
	}
}
