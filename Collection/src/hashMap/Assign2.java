package hashMap;

import java.util.HashMap;

public class Assign2 
{
	//combine one map into another map
	public static void main(String[] args) 
	{
		HashMap< Integer, String> hs1=new HashMap< Integer, String>();
		hs1.put(1, "Lotus");
		hs1.put(2, "Lily");
		hs1.put(3, "Rose");
		hs1.put(4, "Marigold");
		System.out.println(hs1);
		
		HashMap< Integer, String> hs2=new HashMap< Integer, String>();
		hs2.put(5, "Apple");
		hs2.put(6, "Mango");
		hs2.put(7, "Cherry");
		hs2.put(8, "Grapes");
		System.out.println(hs2);
		
		hs1.putAll(hs2);
		System.out.println(hs1);
	}
}
