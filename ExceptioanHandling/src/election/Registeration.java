package election;

public class Registeration 
{
	void register(int age)
	{
		if(age<18)
		{
			try 
			{
				throw new InvalidAgeException();
			}
			catch(InvalidAgeException e)
			{
				System.out.println("Age should be > than 18");
			}
		}else 
		{
			System.out.println("Eligible for voting");
		}
	}
}
