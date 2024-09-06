package while_loop;

public class divisibility_by_5 
{
	public static void main(String[] args) 
	{
		int i=1;
		int n=10;
		while(i<=n)
		{
			if(i%5==0)
			{
				System.out.println(i+ " :- Divisible by five");
			}
			else
			{
				System.out.println(i+ " :- not divisible by five");
			}
			i++;
		}
	}
}
