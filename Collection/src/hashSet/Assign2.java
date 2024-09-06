package hashSet;

import java.util.HashSet;

public class Assign2 
{
	//Remove all element from the set
	public static void main(String[] args) 
	{
		HashSet set1=new HashSet();
		set1.add("Sanskar");
		set1.add(45);
		set1.add(true);
		set1.add(0);
		set1.add(null);
		set1.add(14.78);
		set1.add('a');
		set1.add(7+8);
		set1.add(20);
		System.out.println(set1);
		
		set1.clear();
		System.out.println(set1);
	}
}
