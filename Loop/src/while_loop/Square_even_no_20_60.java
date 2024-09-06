package while_loop;

public class Square_even_no_20_60 
{
	public static void main(String[] args) 
	{
		int i=20;
		while(i<=60)
		{
			if(i%2==0)
			{
				int result=i*i;
				System.out.println(result);
			}
			i++;
		}
	}
}
