package comparator;

import java.util.Comparator;

public class Mycomparator1 implements Comparator<Person1>
{
	public int compare(Person1 p1,Person1 p2)
	{
		return Integer.compare(p1.getAge(), p2.getAge());
	}
}
