package hashSet;

import java.util.HashSet;

public class Assign8 
{
	public static void main(String[] args) 
	{
		//size of set
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
		System.out.println(set1.size());
	}
}
