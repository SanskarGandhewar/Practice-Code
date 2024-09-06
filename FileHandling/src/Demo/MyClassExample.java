package Demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MyClassExample 
{
	public static void main(String[] args) throws IOException 
	{
		File file=new File("C:\\Users\\SANSKAR\\Desktop\\Demo\\Test.txt");
		FileReader fr=new FileReader(file);
		BufferedReader br=new BufferedReader(fr);
		
		String Currentline;
		
		while((Currentline =br.readLine())!=null)
		{
			System.out.println(Currentline);
		}
		br.close();
		System.out.println("Done...");
	}
}
