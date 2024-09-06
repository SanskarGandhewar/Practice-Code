package demo8;

public class Demo 
{
	//static method
	static void showMessage()
	{
		System.out.println("Hi Sanskar ");
	}
	
	void add()
	{
		//Non-static method with no argument and no ReturnType
		int num1=2;
		int num2=5;
		int sum=num1+num2;
		System.out.println("Sum of number: "+sum);
	}
	
	int division()
	{
		//No argument but returnType
		int num1=10;
		int num2=5;
		int result=num1/num2;
		System.out.println("Division of number: "+result);
		return result;
	}
	
	int divide(int divident ,int divisor)
	{
		return divident/divisor;
		
	}

	
	String name(String Name)
	{
		//No argument but returnType
		return Name;
	}
	
	void multiplay(int x,int y)
	{
		//No returnType with Argument
		int sum=x*y;
		System.out.println("Multiplication of number is: "+sum);
	}
	
	public static void main(String[] args) 
	{
		//Non-static method calling
		Demo d = new Demo();
		d.add();
		d.multiplay(5, 4);
		d.division();
		int s=d.divide(120, 2);
		System.out.println("quasent: "+s);
		System.out.println(d.name("Riya"));
	
		//static method calling
		showMessage();
	}
}
