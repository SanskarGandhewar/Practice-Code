package hashMap;

import java.util.HashMap;

public class MyClass
{
	public static void main(String[] args) 
	{
		HashMap h=new HashMap();
		h.put(1, "Sanskar");
		h.put(null, 78);
		h.put('t', 'o');
		h.put("Tenna",76.54);
		System.out.println(h);
		
		System.out.println(h.entrySet());
		System.out.println(h.keySet());
		System.out.println(h.values());
		
	}
}
