package StringBuffer_SrtringBuilder;

public class Assign4 
{
	public static void main(String[] args) 
	{
		StringBuffer s1=new StringBuffer("Riya Sharma");
		System.out.println(s1);
		
		StringBuilder s2=new StringBuilder("Riya Roy");
		System.out.println(s2);
		
		System.out.println("StringBuffer Reverse: "+s1.reverse());
		System.out.println("StringBuilder Reverse:"+s2.reverse());
		
	}
}
