package do_while;

public class cube_even_between_1_20 
{
	public static void main(String[] args) 
	{
		int i=1;
		do 
		{
			if(i%2==0)
			{
				int result=i*i*i;
				System.out.println(result);
			}
			i++;	
		}while(i<=20);
	}
}
