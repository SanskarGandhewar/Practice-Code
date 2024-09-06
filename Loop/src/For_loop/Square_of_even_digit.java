package For_loop;

public class Square_of_even_digit 
{
	public static void main(String[] args) 
	{
		int num=52413;
		for(int i=0;num!=0;i++)
		{
			int result=num%10;
			num=num/10;
			
			if(result%2==0)
			{
				int Square=result*result;
				System.out.println("form the given num the even no "+result+" Square is :- "+Square);
			}
		}
	}
}
