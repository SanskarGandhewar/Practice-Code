package hashMap;

import java.util.HashMap;

public class Assign10 
{
	//replace an object in the hashMap
	public static void main(String[] args) 
	{

		HashMap< Integer, String> hs1=new HashMap< Integer, String>();
		hs1.put(1, "Lotus");
		hs1.put(2, "Lily");
		hs1.put(3, "Rose");
		hs1.put(4, "Marigold");
		System.out.println(hs1);
		
		hs1.replace(1, "Jasmin");
		System.out.println(hs1);
		
	}
}
