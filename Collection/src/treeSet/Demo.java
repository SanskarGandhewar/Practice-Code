package treeSet;

import java.util.TreeSet;

public class Demo 
{
	public static void main(String[] args) 
	{
		
		TreeSet set1=new TreeSet();
		set1.add(45);
		set1.add(87);
		set1.add(16);
		set1.add(95);
		set1.add(48);
		set1.add(68);
		set1.add(18);
		set1.add(4);
		System.out.println(set1);
		
		System.out.println(set1.first());
		System.out.println(set1.last());
		System.out.println(set1.headSet(45));
		System.out.println(set1.tailSet(45));
		System.out.println(set1.subSet(16, 87));
		
	}
}
