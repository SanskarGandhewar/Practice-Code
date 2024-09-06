package demo2;

public class Tyre implements Movable,Rollable
{
	public boolean isRollable() 
	{
		System.out.println("Rollable: "+true);
		return false;
	}

	
	public boolean isMovable()
	{
		System.out.println("isMovable: "+true);
		return false;
	}
	
}
