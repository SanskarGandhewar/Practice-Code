package hashSet;

import java.util.HashSet;

public class Assign7
{
	public static void main(String[] args) 
	{	//not done
		//remove all the element of the existing set
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
		
		HashSet set2=new HashSet();
		set2.add("Tiger");
		set2.add(78);
		set2.add(false);
		set2.add(0.0);
		set2.add(null);
		set2.add(78.54);
		set2.add('j');
		set2.add(4*5);
		set2.add(84);
		System.out.println(set2);
	}
}
