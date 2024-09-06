package For_loop;

public class Reverse_no 
{
	public static void main(String[] args) 
	{
		int num=352;
		int reverse;
		int result=0;
		for(int i=1;num!=0;i++)
		{
			result=num%10;
			num=num/10;
			reverse=result;
			System.out.print(reverse);
		}
	}
}
