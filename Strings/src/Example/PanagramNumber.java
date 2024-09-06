package Example;

public class PanagramNumber 
{
	public static void main(String[] args) 
	{
		String s1="abcdefghijklmnopqrstuvwxyz";
		int s=s1.length();
		
		int sum=0;
		for (int i = 0; i <=s; i++) 
		{
			sum++;
		}
		char count=' ';
		for (char i = 'a'; i <= 'z'; i++)
		{
			count++;
		}
		System.out.println(count);
	}
}
