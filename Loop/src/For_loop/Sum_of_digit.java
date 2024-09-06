package For_loop;

public class Sum_of_digit 
{
	public static void main(String[] args) 
	{
		int num=341;
		int sum=0;
		for(int i=0;num!=0;i++)
		{
			int result=num%10;
			num=num/10;
			sum=sum+result;
		}
		System.out.println(sum);
	}
}
