package For_loop;

public class even_no_addition_from_10_20 
{
	public static void main(String[] args) 
	{
		int sum=0;
		for(int i=10;i<=20;i++)
		{
			if(i%2==0)
			{
				sum=sum+i;
			}
		}System.out.println("Sum:- "+sum);
	}
}
