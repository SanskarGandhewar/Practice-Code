package do_while;

public class sum_no_from_300_to_350_divide_3 
{
	public static void main(String[] args) 
	{
		int sum=0;
		int i=300;
		do
		{
			if(i%3==0)
			{
				sum=sum+i;
			}
			i++;
		}while(i<=350);
		System.out.println("Sum:- "+sum);
	}
}
