 package For_loop;

public class palindrome 
{
	public static void main(String[] args) 
	{
		int num=313;
		int temp=num;
		int rev=0;
		for(int i=1;num!=0;i++)
		{
			int result=num%10;
			rev=(rev*10)+result;
			num=num/10;
		}System.out.println(rev);
	
		if(temp==rev)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("not");
		}
	}
}