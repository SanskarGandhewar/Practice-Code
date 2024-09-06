package do_while;

public class odd_between_1_to_10 
{
	public static void main(String[] args) 
	{
		int i=1;
		do {
			if(i%2!=0)
			{
				System.out.println(i+ ":- Odd");
			}
			i++;
		}while(i<=10);
	}
}
