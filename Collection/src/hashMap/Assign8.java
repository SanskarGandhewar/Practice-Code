package hashMap;

import java.util.HashMap;

public class Assign8 
{
	//remove an object on key based value
	public static void main(String[] args) 
	{
		HashMap< Integer, String> hs1=new HashMap< Integer, String>();
		hs1.put(1, "Lotus");
		hs1.put(2, "Lily");
		hs1.put(3, "Rose");
		hs1.put(4, "Lotus");
		System.out.println(hs1);
		
		hs1.remove(1, "Lotus");
		System.out.println(hs1);

	}
}
