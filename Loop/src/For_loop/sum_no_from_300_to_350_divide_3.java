package For_loop;

public class sum_no_from_300_to_350_divide_3 
{
	public static void main(String[] args) 
	{
		int sum=0;
		
		for(int i=300;i<=350;i++)
		{
			if(i%3==0)
			{
				sum=sum+i;
			}
		}System.out.println(sum);
	}
}
