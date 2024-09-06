package while_loop;

public class palindrome 
{
	public static void main(String[] args) 
	{
		int i=1;
		int num=313;
		int rev=0;
		int temp=num;
		while(num!=0)
		{
			int result=num%10;
			rev=(rev*10)+result;
			num=num/10;
			System.out.print(result);
		}
		if(temp==rev)
		{
			System.out.println(" is a Palindrome");
		}
		else
		{
			System.out.println(" is Not a Palindrome");
		}
	}
}
