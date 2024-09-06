package Demo;

class A
{
	int num1=124;
	void display()
	{
		System.out.println("Hii From Parent Class Method");
	}
}
class B extends A
{
	int num2=457;
	void show()
	{
		System.out.println("Hii From Child Class Method");
	}
}

public class MyClass 
{
	public static void main(String[] args) 
	{
		A a= new A();
		a.display();
		System.out.println(a.num1);
		System.out.println();
		
		B b = new B();
		b.display();
		b.show();
		System.out.println(b.num1);
		System.out.println(b.num2);

	}
}
