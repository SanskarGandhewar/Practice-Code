package For_loop;

public class odd_no_addition_from_20_30 
{
	public static void main(String[] args) 
	{
		int sum=0;
		for(int i=20;i<=30;i++)
		{
			if(i%2!=0)
			{
				sum=sum+i;
			}
		}System.out.println("Sum:- "+sum);
	}
}
