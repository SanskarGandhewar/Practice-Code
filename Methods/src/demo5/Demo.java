package demo5;

public class Demo 
{
	//Static Method
	//Type-1 & Type-2 
	public static void sub() 
	{
		int a=5;
		int b=6;
		int result=a+b;
		displayResult(result);
		
	}
	
	public static void displayResult(int Result) 
	{
		System.out.println("The Result is: "+Result);
	}
	
	public static void main(String[] args) 
	{
		sub();
		
	}
}
