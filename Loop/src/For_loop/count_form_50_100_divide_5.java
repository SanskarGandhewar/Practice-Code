package For_loop;

public class count_form_50_100_divide_5 
{
	public static void main(String[] args) 
	{
		int num=1;
		int count=0;
		for(int i=50;i<=100;i++)
		{
			if(i%5==0)
			{
				count++;	
			}
		}System.out.println(count);
	}
}
