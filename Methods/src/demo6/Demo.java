package demo6;

public class Demo 
{
	//Static Method
	//Type-3 Method with No Argument But With ReturnType
	public static int sub()
	{
		int a=10;
		int b=50;
		int result=a*b;
		return result;
		
		
	}
	public static void displayResult()
	{
		int result=sub();
		System.out.println("The result is: "+result);
	}
	
	public static void main(String[] args) 
	{
		displayResult();
	}
	
}
