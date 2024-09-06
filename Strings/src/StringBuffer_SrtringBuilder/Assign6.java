package StringBuffer_SrtringBuilder;

public class Assign6
{
	public static void main(String[] args) 
	{
		StringBuffer s1=new StringBuffer("Welcome to String Buffer");
		System.out.println(s1);
		
		s1.delete(2, 7);
		System.out.println(s1);
		
		StringBuilder s2=new StringBuilder("Welcome to String Builder");
		System.out.println(s2);
		
		s2.delete(8, 12);
		System.out.println(s2);
		
	}
}
