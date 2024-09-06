package StringBuffer_SrtringBuilder;

public class Assign7 
{
	public static void main(String[] args) 
	{
		StringBuffer s1=new StringBuffer("Welcome to String Buffer");
		System.out.println(s1);
		
		s1.replace(3, 7, "Done");
		System.out.println(s1);
		
		StringBuilder s2=new StringBuilder("Welcome to String Builder");
		System.out.println(s2);
		
		s2.replace(12, 16, "Null");
		System.out.println(s2);
	}
}
