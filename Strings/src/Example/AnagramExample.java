package Example;

import java.util.Arrays;

public class AnagramExample
{
	//My own Concept
	public static void main(String[] args) 
	{
		char str1[]= {'s','i','l','e','n','t'};
		char str2[]= {'l','i','s','t','e','n'};
		
		int a=str1.length;
		int b=str2.length;
		
		Arrays.sort(str1);
		Arrays.sort(str2);
		
		int result=0;
		for (int i = 0; i <a; i++)
		{
			if(a==b)
			{
				result++;
			}
		}
		if(a==b)
		{
			System.out.println("The given String is Anagram");
		}
		else
		{
			System.out.println("The given String is not a Anagram");
		}
	}
}
