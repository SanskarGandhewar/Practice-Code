package StringBuffer_SrtringBuilder;

public class MyClass 
{
	public static void main(String[] args) 
	{
		StringBuffer s1=new StringBuffer("Reena");
		System.out.println(s1);
		
		s1.append(" Sharma");
		System.out.println(s1);
		
		System.out.println(s1.reverse());
		
		StringBuilder s2=new StringBuilder("Riya");
		System.out.println(s2);
		
		s2.append(" Roy");
		System.out.println(s2);
		
		System.out.println(s2.reverse());
	}
}
