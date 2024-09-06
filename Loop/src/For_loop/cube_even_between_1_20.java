package For_loop;

public class cube_even_between_1_20 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=20;i++)
		{
			if(i%2==0)
			{
				int result=i*i*i;
				System.out.println(result);
			}
		}
	}
}
