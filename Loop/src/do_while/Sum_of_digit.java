package do_while;

public class Sum_of_digit 
{
	public static void main(String[] args) 
		{
		int sum=0;
		int num=341;
		int i=1;
		do {
			int result=num%10;
			num=num/10;
			sum=sum+result;
			i++;
		}while(num!=0);
		System.out.println(sum);
	}
}