package while_loop;

public class Square_of_even_digit 
{
	public static void main(String[] args) 
	{
		int i=0;
		int num=52413;
		while(num!=0)
		{
			int result=num%10;
			num=num/10;
			if(result%2==0)
			{
				int square=result*result;
				System.out.println("Square of even no "+result+" is:- "+square);
			}
			i++;
		}
	}
}
