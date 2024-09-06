package Demo;

public class DEMO 
{
	public void concat() 
	{
		String s1="Hello";
		String s2="World";
		
		s1=s1.concat(s2);
		System.out.println("S1 value: "+s1);
		System.out.println("S2 value: "+s2);
		System.out.println("After Concate: "+s1);
	}
	
	public void  CharAt(String s1,int index) 
	{
		char ch=s1.charAt(index);
		System.out.println(ch);
	}
	
	public void findLength(String s) 
	{
		int length=s.length();
		System.out.println("Length of The given String: "+length);
	}
	
	public void FindSubString(String s) 
	{
		//0 1 2 3 4 5 6
		//S a n s k a r
		String result=s.substring(2);
		System.out.println(result);
	}
	
	public void FindSubStringSecondVariation(String s) 
	{
		//0 1 2 3 4 5 6
		//S a n s k a r
		String result=s.substring(2, 5);
		System.out.println(result);
	}
	
	public void StringContain(String s1,String s2)
	{
		boolean result=s1.contains(s2);
		System.out.println("String s1 contain s2: "+result);
	}
	
	public void StringEqual(String s1,String s2)
	{
		boolean result=s1.equals(s2);
		System.out.println("S1 is Equal to s2: "+result);
		
		System.out.println("S1 is Equal to s2:"+s1.equalsIgnoreCase(s2));
		
		System.out.println("S1 is Equal to s2:"+s1==s2);
	}
	
	public void StringCases(String s1,String s2)
	{
		s1=s1.toLowerCase();
		s2=s2.toUpperCase();
		System.out.println(s1);
		System.out.println(s2);
	}
	
	public void StringTrim()
	{
		String s1="      Hello    ";
		System.out.println(s1.trim());
	}
	
	public void StringIndexOf(String s1,int ch)
	{
		System.out.println(s1.indexOf(ch));
	}
	public static void main(String[] args) 
	{
		DEMO n = new DEMO();
		n.concat();
		n.CharAt("WelCome",5);
		n.findLength("HelloWorld");
		n.FindSubString("Sanskar");
		n.FindSubStringSecondVariation("Sanskar");
		n.StringContain("Welcome", "com");
		n.StringEqual("reena", "Reena");
		n.StringCases("Renna", "Menna");
		n.StringTrim();
		n.StringIndexOf("Sanskar", 's');
	}
}
