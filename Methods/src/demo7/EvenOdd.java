package demo7;

public class EvenOdd
{
	public static void M1(int num) 
	{
		//Check Even Odd number
		if(num%2==0)
		{
			System.out.println("The Given Number is Even");
		}
		else
		{
			System.out.println("The Given Number is Odd");
		}
	}
	
	public static void M2(int num) 
	{
		//Create Table
		for(int i=1;i<=num;i++)
		{
			System.out.println(num+" * "+i+" = "+num*i);
		}
	}
	
	public static void M3(int num) 
	{
		//Sum of Digit
		int sum=0;
		for(int i=1;num!=0;i++)
		{
			int result=num%10;
			sum=sum+result;
			num=num/10;
		}
		System.out.println("Sum of Digit: "+sum);
	}
	
	public static void M4(int num)
	{
		//Reverse Number
		int Rev=0;
		while(num!=0)
		{
			int result=num%10;
			Rev=(Rev * 10)+result;
			num=num/10;
		}
		System.out.println("Reverse Number: "+Rev);
	}
	
	public static void M5(int JAVA,int HTML,int CSS,int PYTHON,int CPP) 
	{
		//Calculate TotalMarks and Average
		
		int TotalMarks=JAVA+HTML+CSS+PYTHON+CPP;
		System.out.println("TotalMarks: "+TotalMarks);
		
		double Average=(TotalMarks*100/500);
		System.out.println("Average: "+Average);
		
		
	}
	
	public static void main(String[] args) 
	{
		System.out.println("***Task-1***");
		M1(45);
		System.out.println();
		System.out.println("***Task-2***");
		M2(8);
		System.out.println();
		System.out.println("***Task-3***");
		M3(12345);
		System.out.println();
		System.out.println("***Task-4***");
		M4(12345);
		System.out.println();
		System.out.println("***Task-5***");
		M5(95,88,96, 90, 98);
		System.out.println();
	}
	
}
