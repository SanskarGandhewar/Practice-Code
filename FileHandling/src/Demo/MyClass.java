package Demo;

import java.io.File;

public class MyClass 
{
	public static void main(String[] args) 
	{
		String one="C:\\Users\\SANSKAR\\Desktop\\Demo\\Test";
		
		File file=new File(one);
		
		if(!file.exists())
		{
			file.mkdir();
			System.out.println("Directory Successfully Created!!!");
		}
		else
		{
			System.out.println("Directory already existed");
		}
	}
}
