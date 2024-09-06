package demo2;

public class OverloadingMain 
{
	public static void main(String[] args) 
	{
		Overload o = new Overload();
		o.Demo(42);
		o.Demo(5, 4);
		System.out.println(o.Demo(8.0));
		System.out.println(o.Demo(5, 4, 3));
		
//		double d=o.Demo(5.0);
//		System.out.println(d);
//		int i=o.Demo(5, 4, 3);
//		System.out.println(i);
				
	}

}
