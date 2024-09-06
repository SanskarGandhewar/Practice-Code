package while_loop;

public class Sum_of_digit 
{
	public static void main(String[] args) 
	{
		int sum=0;
		int num=1234;
		
		while(num!=0)
		{
			int result=num%10;
			num=num/10;
			sum=sum+result;
			
		}
		System.out.println(sum);
	}
}
