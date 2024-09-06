package do_while;

public class Reverse_no 
{
	public static void main(String[] args) 
	{
		int num=352;
		int reverse=0;
		do {
			int result=num%10;
			reverse=(reverse*10)+result;
			num=num/10;
		}while(num!=0);
		System.out.println("Reverse:- "+reverse);
	}
}
