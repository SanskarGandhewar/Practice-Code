package while_loop;

public class Reverse_no 
{
	public static void main(String[] args) 
	{
		int num=352;
		int reverse=0;
		while(num!=0)
		{
			int result=num%10;
			reverse=(reverse*10)+result;
			num=num/10;
		}System.out.println("Reverse no:- "+reverse);
	}
}
