package Example;

import java.util.Scanner;

public class Palindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s1=sc.next();
		String s2="";
		
		int sLength=s1.length();
		
		for (int i=(sLength-1); i>=0; --i)
		{	
			s2=s2+s1.charAt(i);					
		}
		if (s2.toLowerCase().equals(s1.toLowerCase()))
		{
			System.out.println(s1+ " is palindrome");
		} 
		else 
		{
			System.out.println(s1 + " is not a palindrome");
		}
	}
}
