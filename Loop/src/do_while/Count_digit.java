package do_while;

public class Count_digit 
{
	public static void main(String[] args) 
	{
		int count=0;
		int num=4235;
		int i=1;
		do {
			int result=num%10;
			count++;
			num=num/10;
			i++;
		}while(num!=0);
		System.out.println("Count:- "+count);
	}
}
