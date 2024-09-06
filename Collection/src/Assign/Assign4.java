package Assign;

import java.util.LinkedList;

public class Assign4 
{
	//insert an element at the end, at the beginning and specified position
	public static void main(String[] args) 
	{
		LinkedList list1 =new LinkedList();
		list1.add(null);
		list1.add(100);
		list1.add('a');
		list1.add(85.1);
		list1.add(0);
		list1.add(true);
		list1.add(false);
		list1.add("Sanskar");
		list1.add(0.1);
		System.out.println(list1);
		
		list1.addFirst("Tiger");
		System.out.println(list1);
		
		list1.addLast("Lion");
		System.out.println(list1);
		
		list1.add(4, "sansakr");
		System.out.println(list1);
	}
}
