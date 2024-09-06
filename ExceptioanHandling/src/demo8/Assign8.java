package demo8;

public class Assign8
{
	public int division(int a,int b)throws DivisionByZeroException
	{
		if(b==0)
		{
			throw new DivisionByZeroException("Denominator should not be zero");
		}
		return a/b;
	}
	
	public int StringLength(String s)throws NullStringException
	{
		if(s.length()==0)
		{
			throw new NullStringException("String should not be null");
		}
		else
		{
			System.out.println("task done");
		}
		return 0;
	}
}
