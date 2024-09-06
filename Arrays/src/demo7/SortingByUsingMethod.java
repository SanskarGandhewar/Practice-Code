package demo7;

public class SortingByUsingMethod 
{
	void sort(int a[])
	{
		for (int i = 0; i < a.length; i++)
		{
			for (int j = i+1; j < a.length; j++)
			{
				if (a[i]>a[j]) 
				{
					int temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
	}
	void display(int a[])
	{
		System.out.println("Display Sorting Array: ");
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println(a[i]+" ");
		}
	}
	
	void SearchElement(int a[],int element)
	{
		int flag=0;
		for (int i = 0; i < a.length; i++) 
		{
			if(element==a[i])
			{
				flag=1;
				System.out.println("Element found at index: "+i);
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("Element not found...");
		}
	}
	
	public static void main(String[] args) 
	{
		int a[]= {14,45,78,35,11};
		SortingByUsingMethod s = new SortingByUsingMethod();
		s.SearchElement(a, 34);
		s.sort(a);
		s.display(a);
		
	}
}
