package do_while;

public class count_form_50_100_divide_5 
{
	public static void main(String[] args) 
	{
		int i=50;
		int count=0;
		do
		{
			if(i%5==0)
			{
				count++;
			}i++;
		}while(i<=100);
		System.out.println(count);
	}
}
