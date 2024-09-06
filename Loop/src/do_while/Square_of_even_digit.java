package do_while;

public class Square_of_even_digit 
{
	public static void main(String[] args) 
	{
		int i=0;
		int num=524133;
		do 
		{
			int result=num%10;
			num=num/10;
			
			if(result%2==0)
			{
				int Square=result*result;
				System.out.println("The Square of even no "+result+" is:- "+Square);
			}
			i++;
		}while(num!=0);
	}
}
