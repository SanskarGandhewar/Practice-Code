package demo1;

public class Area
{
	int length;
	int breadth;
	
	public Area(int l,int b) 
	{
		length=l;
		breadth=b;	
	}
	public void Rectangle()
	{
		int area=length*breadth;
		System.out.println("Area: "+area);
	}
}