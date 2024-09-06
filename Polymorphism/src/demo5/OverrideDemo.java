package demo5;

public class OverrideDemo
{
	public static void main(String[] args) 
	{
		BaseClass B = new BaseClass();
		B.method1();
		
		DerivedClass D = new DerivedClass();
		D.method1();
	}
}
