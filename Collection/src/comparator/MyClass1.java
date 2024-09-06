package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyClass1
{
	public static void main(String[] args) 
	{
		List<Person1> list=new ArrayList<Person1>();
		list.add(new Person1("Teena",21));
		list.add(new Person1("Meena",25));
		list.add(new Person1("Shreya",32));
		list.add(new Person1("Riya",35));
		
		Collections.sort(list,new Mycomparator1());
		
		System.out.println(list);
		
		
		
	}
}
