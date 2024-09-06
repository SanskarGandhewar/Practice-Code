package ArrayListExamole;

import java.util.ArrayList;

public class AddingBothListInOne
{
	public static void main(String[] args) 
	{
		ArrayList list1=new ArrayList();
		list1.add("Sanskar");
		list1.add("sanskruti");
		System.out.println(list1);
		
		ArrayList list2=new ArrayList();
		list2.add("Mangesh");
		list2.add("Yogesh");
		list2.add("Surbhi");
		System.out.println(list2);

	
		
		list1.addAll(list2);
		System.out.println(list1);
		
		//Use for Check the Given Input Is present or not
		System.out.println(list2.contains("Mangesh"));
	}
}
