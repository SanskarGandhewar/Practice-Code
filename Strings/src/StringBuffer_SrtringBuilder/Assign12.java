package StringBuffer_SrtringBuilder;

public class Assign12 
{
	public static void main(String[] args) 
	{
		StringBuffer s1=new StringBuffer("Welcome to String Buffer");
		System.out.println(s1);
		
		System.out.println(s1.capacity());
		
		StringBuilder s2=new StringBuilder("Welcome to String Builder");
		System.out.println(s2);
		
		System.out.println(s2.capacity());
		
	}
}
