package Methodoverloading;

public class MyClass
{
	int side;
	int length;
	int breath;
	int Area;
	int result;
	
	void area(int side)
	{
		this.side=side;
		 Area =side*side;
	}
	
	void area(int length,int breath)
	{
		this.length=length;
		this.breath=breath;
		result=length*breath;
	}
	
	void display()
	{
		System.out.println("Area of Square : "+Area);
		System.out.println("Area of Rectangle: "+result);
	}
	
	public static void main(String[] args) 
	{
		MyClass m = new MyClass();
		m.area(4);
		m.area(3, 4);
		m.display();
		
	}
}
