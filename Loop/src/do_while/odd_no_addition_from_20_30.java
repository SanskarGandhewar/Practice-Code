package do_while;

public class odd_no_addition_from_20_30 
{
	public static void main(String[] args) 
	{
		int sum=0;
		int i=20;
		do {
			if(i%2!=0)
			{
				sum=sum+i;
			}i++;
		}while(i<=30);
		System.out.println("Sum:- "+sum);
	}
}
