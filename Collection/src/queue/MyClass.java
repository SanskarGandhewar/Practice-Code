package queue;

import java.util.PriorityQueue;

public class MyClass 
{
	public static void main(String[] args)
	{
		PriorityQueue pq=new PriorityQueue();
		pq.add("lotus");
		pq.add("lilly");
		pq.add("poppy");
		pq.add("jasmin");
		pq.add("hibiscus");
		pq.add("champa");
		pq.add("tulsi");
		pq.offer("morning-glory");
		
		System.out.println(pq);
		
		pq.remove();
		System.out.println(pq);
		
		pq.poll();
		System.out.println(pq);
		
		System.out.println(pq.peek());
		
		System.out.println(pq.element());
		
		
		
	}
}
