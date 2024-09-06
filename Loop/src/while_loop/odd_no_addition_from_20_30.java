package while_loop;

public class odd_no_addition_from_20_30 
{
	public static void main(String[] args) 
	{
		int sum=0;
		int i=20;
		while(i<=30)
		{
			if(i%2!=0)
			{
				sum=sum+i;
			}i++;
		}System.out.println("Sum:- "+sum);
	}
}
