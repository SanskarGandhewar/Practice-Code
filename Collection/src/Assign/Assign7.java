package Assign;

import java.util.LinkedList;

public class Assign7
{//add all element from another linked list the previous one 
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
		
		LinkedList list2 =new LinkedList();
		list2.add("zero");
		list2.add(10);
		list2.add('f');
		list2.add(4.1);
		list2.add(100);
		list2.add(true);
		list2.add(false);
		list2.add("lion");
		list2.add(0.7);
		System.out.println(list2);
		
		list1.add(list2);
		System.out.println(list1);
		
		
		
		
		
		
	}
}
