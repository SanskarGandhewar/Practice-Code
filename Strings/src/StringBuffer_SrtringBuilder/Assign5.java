package StringBuffer_SrtringBuilder;

public class Assign5
{
	public static void main(String[] args) 
	{
		StringBuffer s1=new StringBuffer("Mam");
		System.out.println(s1);
		
		s1.setCharAt(2, 'd');
		System.out.println(s1);
		
		System.out.println(s1.charAt(2));
		
		StringBuilder s2=new StringBuilder("Reena");
		System.out.println(s2);
		
		s2.setCharAt(0, 'M');
		System.out.println(s2);
		
		System.out.println(s2.charAt(2));
		
	}
}
