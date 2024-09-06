package Demo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class MyMainClass
{
	public static void main(String[] args) throws IOException 
	{
		String s="Welcome to Programming World";
		File file=new File("C:\\Users\\SANSKAR\\Desktop\\Demo\\test.txt");
		
		FileOutputStream fout=new FileOutputStream(file);
		if(!file.exists())
		{
			file.createNewFile();
		}
		System.out.println("File SucessFully Creaded");
		
		byte b[]=s.getBytes();
		fout.write(b);
		fout.flush();
		fout.close();
		System.out.println("File Already exited");
	}
	
}
