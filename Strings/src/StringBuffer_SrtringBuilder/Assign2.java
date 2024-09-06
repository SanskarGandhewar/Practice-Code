package StringBuffer_SrtringBuilder;

public class Assign2 
{
	public static void main(String[] args) 
	{
		StringBuffer s1=new StringBuffer("String Buffer Example");
		
		String s=s1.toString();
		
		boolean flag=s.contains("Buf");
		System.out.println(flag);
		
		StringBuilder s2=new StringBuilder("StringBuilder Example");
		String s3=s2.toString();
		
		boolean flag1=s3.contains("Bui");
		System.out.println(flag1);
		
	}
}
