package hashMap;

import java.util.HashMap;

public class Assign1
{
	//Print hashMap  
	public static void main(String[] args) 
	{
		HashMap< Integer, String> hs=new HashMap< Integer, String>();
		hs.put(1, "Lotus");
		hs.put(2, "Lily");
		hs.put(3, "Rose");
		hs.put(4, "Marigold");
		hs.put(5, "Apple");
		hs.put(6, "Mango");
		hs.put(7, "Cherry");
		hs.put(8, "Grapes");
		System.out.println(hs);
	}
}
