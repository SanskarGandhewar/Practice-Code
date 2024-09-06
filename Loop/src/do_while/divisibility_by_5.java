package do_while;

public class divisibility_by_5 
{
	public static void main(String[] args) 
	{
		int i=1;
		int n=10;
		do {
			if(i%5==0)
			{
				System.out.println(i+ " :- Divisible by five");
			}
			else
			{
				System.out.println(i+ " :- not Divisible");
			}
			i++;
		}while(i<=n);
	}
}
