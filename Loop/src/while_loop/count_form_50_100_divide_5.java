package while_loop;

public class count_form_50_100_divide_5 
{
	public static void main(String[] args) 
	{
		int i=50;
		int count=0;
		while(i<=100)
		{
			if(i%5==0)
			{
				count++;
			}i++;
		}System.out.println("count:- "+count);
	}
}
