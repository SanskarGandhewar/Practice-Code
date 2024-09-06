package while_loop;

public class even_no_addition_from_10_20 
{
	public static void main(String[] args) 
	{
		int sum=0;
		int i=10;
		while(i<=20)
		{
			if(i%2==0)
			{
				sum=sum+i;
			}i++;
		}System.out.println("Sum:- "+sum);
	}
}
