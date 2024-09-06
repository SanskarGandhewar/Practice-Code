package while_loop;

public class Count_digit 
{
	public static void main(String[] args) 
	{
		int count=0;
		int num=4235;
		int i=0;
		while(num!=0)
		{
			int result=num%10;
			count++;
			num=num/10;
			i++;
		}System.out.println("Count :- "+count);
	}
}
