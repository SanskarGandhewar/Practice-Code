package demo3;
import java.util.Scanner;

public class SumofArray 
{//sum of element of an  array
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Length of an Array: ");
		int size=sc.nextInt();
		int a[]= new int [size];
		System.out.println("Enter the Element of an array: ");
		for (int i = 0; i < a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Displaying the Element: ");
		for (int i = 0; i < a.length; i++)
		{
			System.out.println(a[i]);
		}
		
		int sum=0;
		for (int i = 0; i < a.length; i++) 
		{
			sum=sum+a[i];
			
		}
		System.out.println("Addition of an Array: "+sum);
		
		}
}
