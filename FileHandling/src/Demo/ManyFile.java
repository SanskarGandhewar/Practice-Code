package Demo;

import java.io.File;

public class ManyFile 
{
	public static void main(String[] args) 
	{
		
		String Many="C:\\Users\\SANSKAR\\Desktop\\Demo\\test1\\main\\file";
		
		File file=new File(Many);
		
		if(!file.exists())
		{
			file.mkdirs();
			System.out.println("Directory Successfully Created!!!");
		}
		else
		{
			System.out.println("Directory already existed");
		}
	}
}
