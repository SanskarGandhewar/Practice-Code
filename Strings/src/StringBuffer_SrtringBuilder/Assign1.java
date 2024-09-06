package StringBuffer_SrtringBuilder;

public class Assign1 
{
	public static void main(String[] args) 
	{
		StringBuffer s1=new StringBuffer("Riya");
		System.out.println(s1);
		
		StringBuilder s2=new StringBuilder("Riya");
		System.out.println(s2);
		
		System.out.println(s1.equals(s2));
	}
}
