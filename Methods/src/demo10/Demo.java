package demo10;

public class Demo 	
{
	public void M1(int num)
	{
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("The Given Number "+num +" is PrimeNumber");
		} 
		else
		{
			System.out.println("The Given Number "+num+ "is Not a PrimeNumber");
		}
	}
	
	public static void M2 (int num) 
	{
			if(num%2==0)
			{
				System.out.println("The Given Number "+num+ " is EvenNumber");
			}
			else
			{
				System.out.println("The Given Number "+num+" is OddNumber");
			}
	}
	
	public int M3(int num1,int num2)
	{	
		if(num1>num2)
		{
			System.out.println(num1+" is Greater than " +num2);
		}
		else if(num1<num2)
		{
			System.out.println( num2+" is Greater than " +num1);
		}
		else
		{
			System.out.println("Both Have Same Number");
		}
		return num1 & num2;
	}
	
	public static int M4(int x,int y)
	{
		if(x>y)
		{
			System.out.println(x+" is Smaller than "+y);
		}
		else if(x<y)
		{
			System.out.println(y+" is Smaller than "+x);
		}
		else
		{
			System.out.println("Both Have Same Number");
		}
		return x & y;
	}
	
	public static void main(String[] args) 
	{
		Demo d = new Demo();
		System.out.println("*****Task-1*****");
		d.M1(5);
		System.out.println();
		System.out.println("*****Task-2*****");
		M2(4);
		System.out.println();
		System.out.println("*****Task-3*****");
		d.M3(6, 9);
		System.out.println();
		System.out.println("*****Task-4*****");
		M4(7, 3);
	}	
}
