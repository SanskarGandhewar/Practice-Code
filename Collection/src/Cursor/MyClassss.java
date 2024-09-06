package Cursor;

import java.util.LinkedList;
import java.util.ListIterator;

public class MyClassss 
{
	public static void main(String[] args) 
	{
		LinkedList list=new LinkedList();
		list.add("Tiger");
		list.add("Lion");
		list.add("Dog");
		list.add("Cat");
		list.add("Cow");
		System.out.println(list);
		
		ListIterator i=list.listIterator();
		while(i.hasNext())
		{
			String s=(String)i.next();
			if(s.equals("Lion"))
			{
				i.remove();
				System.out.println(list);
			}
			else if(s.equals("Dog"))
			{
				i.add("mouse");
				System.out.println(list);
			}
			else if(s.equals("Cat"))
			{
				i.set("man");
				System.out.println(list);
			}
		}	
	}
}
