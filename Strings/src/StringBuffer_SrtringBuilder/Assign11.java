package StringBuffer_SrtringBuilder;

public class Assign11 
{
	public static void main(String[] args) 
	{
		StringBuffer s1=new StringBuffer("Welcome To String Buffer");
		System.out.println(s1);
		System.out.println(s1.length());
		System.out.println(s1.capacity());
		
		s1.trimToSize();
		System.out.println(s1.length());
		System.out.println(s1.capacity());
		
		
		
		
		StringBuilder s2=new StringBuilder("Welcome to String Builder");
		System.out.println(s2);
		System.out.println(s2.length());
		System.out.println(s2.capacity());
		
		s2.trimToSize();
		System.out.println(s2.length());
		System.out.println(s2.capacity());
		
		
	
	}
}
