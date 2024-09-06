package demo5;



public class AdditoinOfArray 
{
	public static void main(String[] args) 
	{
		int a[]= {5,4,6,8,7};
		int b[]= {5,7,8,4,6};
		int c[]= new int [a.length+b.length];
		int index=0;
		
		for (int i = 0; i < a.length; i++)
		{
			c[index++]=a[i];
		}
		
		for (int i = 0; i < b.length; i++)
		{
			c[index++]=b[i];
		}
		
		for (int i = 0; i < c.length; i++)
		{
			System.out.println(i+" Index Contain: "+c[i]);
		}
		
		
		
		
	}
}
