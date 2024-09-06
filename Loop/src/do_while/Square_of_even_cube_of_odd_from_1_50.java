package do_while;

public class Square_of_even_cube_of_odd_from_1_50 
{
	public static void main(String[] args) 
	{
		int i=1;
		do 
		{
			if(i%2==0)
			{
				int sqr=i*i;
				System.out.println("Square of "+i+" is:- "+sqr);
			}
			else
			{
				int cube=i*i*i;
				System.out.println("cube of "+i+" is:- "+cube);
			}
			i++;
		}while(i<=50);
	}
}
