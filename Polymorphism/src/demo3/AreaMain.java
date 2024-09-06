package demo3;

public class AreaMain 
{
	public static void main(String[] args) 
	{
		Area a1 = new Area();
		Area a2 = new Area();
		System.out.println("Area for 1st object: ");
		a1.find(5, 6);
		a1.find(5, 4, 3);
		System.out.println();
		System.out.println("Area for 2nd object: ");
		
		a2.find(4, 7);
		a2.find(8, 2, 3);
	}
}
