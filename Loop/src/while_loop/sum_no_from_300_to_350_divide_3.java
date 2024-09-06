package while_loop;

public class sum_no_from_300_to_350_divide_3 
{
	public static void main(String[] args) 
	{
		int i=300;
		int sum=0;
		while(i<=350)
		{
			if(i%3==0)
			{
				sum=sum+i;	
			}
			i++;
		}System.out.println("sum :- "+sum);
	}
}
