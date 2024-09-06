package Example;

import java.util.Arrays;

public class Anagram
{
	//InterNet Concept
	public static Boolean areAnagram(char[]Str1,char[]Str2)
	{
		int n1=Str1.length;
		int n2=Str2.length;
		
		if(n1!=n2)
		{
			return false;
		}
		
		Arrays.sort(Str1);
		Arrays.sort(Str2);
		
		for (int i = 0; i < n1; i++)
		{
			if (Str1[i]!=Str2[i])
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) 
	{
		char Str1[]= {'s','i','l','e','n','t'};
		char Str2[]= {'l','i','s','t','e','n'};
		
		if(areAnagram(Str1, Str2))
		{
			System.out.println("Two String Are"+" Anagram to Each Other");
		}
		else
		{
			System.out.println("Two String Are not"+" Anagram To Each Other");
		}	
	}
}
