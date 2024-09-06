package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyClass
{
	public static void main(String[] args) 
	{
		List<Person> list=new ArrayList<Person>();
		list.add(new Person(22, "Sanskar"));
		list.add(new Person(22, "Sanskruti"));
		list.add(new Person(27, "Mangesh"));
		list.add(new Person(28, "Yogesh"));
		list.add(new Person(30, "Surbhi"));
		
		Collections.sort(list ,new MyComparator());
		System.out.println(list);
		
		
	}
}
