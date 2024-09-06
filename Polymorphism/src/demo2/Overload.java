package demo2;

public class Overload
{
	void Demo(int a)
	{
		System.out.println("Value of a--->: "+a);
	}
	void Demo(int a,int b)
	{
		System.out.println("Value of a---->"+a);
		System.out.println("Value of b---->"+b);
	}
	double Demo(double a)
	{
		System.out.println("Value of a---->"+a);
		double sum=a*a;
		return sum;
	}
	int Demo(int a,int b,int c)
	{
		int sum=a+b+c;
		return sum;
	}
}
