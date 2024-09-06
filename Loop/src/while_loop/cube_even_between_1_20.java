package while_loop;

public class cube_even_between_1_20 
{
	public static void main(String[] args) 
	{
		int i=2;
		while(i<=20)
		{
			if(i%2==0)
			{	
				int result=i*i*i;
				System.out.println("cube of " +i+ " is :- " +result);
			}
			i++;
		}
	}
}
