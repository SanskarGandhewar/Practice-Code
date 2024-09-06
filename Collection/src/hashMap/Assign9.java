package hashMap;

import java.util.HashMap;

public class Assign9 
{
	//get size of an hashMap
	public static void main(String[] args) 
	{
		HashMap< Integer, String> hs1=new HashMap< Integer, String>();
		hs1.put(1, "Lotus");
		hs1.put(2, "Lily");
		hs1.put(3, "Rose");
		hs1.put(4, "Lotus");
		System.out.println(hs1);
		
		System.out.println(hs1.size());
	}
}
