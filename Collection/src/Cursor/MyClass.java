package Cursor;

import java.util.Enumeration;
import java.util.Vector;

public class MyClass 
{
	public static void main(String[] args) 
	{
		Vector v=new Vector();
		v.add(54);
		v.add(28);
		v.add(16);
		v.add(57);
		v.add(61);
		v.add(29);
		v.add(74);
		v.add(93);
		System.out.println(v);
		
		Enumeration e=v.elements();
		
		while (e.hasMoreElements())
		{
			Integer i = (Integer) e.nextElement();
			if(i%2==0)
			{
				System.out.println(i);
			}	
		}
	}
}