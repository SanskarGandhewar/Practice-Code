package Cursor;

import java.util.ArrayList;
import java.util.Iterator;

public class MyClasss
{
	public static void main(String[] args) 
	{
		ArrayList list =new ArrayList();
		for (int i = 1; i <=10; i++)
		{
			list.add(i);
		}
		System.out.println(list);
		
		Iterator i=list.iterator();
		
		while(i.hasNext())
		{
			Integer inte=(Integer)i.next();
			if(inte%2==0)
			{
				System.out.println(inte);
			}
			else
			{
				i.remove();
			}
		}
		System.out.println(list);
	}
}
