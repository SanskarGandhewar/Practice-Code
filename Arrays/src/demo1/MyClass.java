package demo1;

public class MyClass 
{
	int a[]=new int[5];
	
	public void M1()
	{
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
	}
	
	public void M2()
	{
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	
	public void M3()
	{
		float a[]=new float[5];
		a[0]=15.4f;
		a[1]=14.7f;
		a[2]=10.4f;
		a[3]=7.8f;
		a[4]=87.45f;
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
	}
	
	public void M4() 
	{
		char a[]=new char[5];
		a[0]='a';
		a[1]='b';
		a[2]='c';
		a[3]='d';
		a[4]='e';
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println(a[i]);
		}
	}
	
	
	public static void main(String[] args) 
	{
		MyClass m = new MyClass();
		System.out.println("*****Task-1*****");
		m.M1();
		System.out.println();
		
		System.out.println("*****Task-2*****");
		m.M2();
		System.out.println();
		
		System.out.println("*****Task-3*****");
		m.M3();
		System.out.println();
		
		System.out.println("*****Task-4*****");
		m.M4();
		System.out.println();
	}
}
