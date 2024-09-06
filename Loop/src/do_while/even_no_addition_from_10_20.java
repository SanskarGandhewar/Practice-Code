package do_while;

public class even_no_addition_from_10_20 
{
	public static void main(String[] args) 
	{
		int sum=0;
		int i=10;
		do {
			if(i%2==0)
			{
				sum=sum+i;
			}i++;
		}while(i<=20);
		System.out.println("Sum:- "+sum);
	}
}
