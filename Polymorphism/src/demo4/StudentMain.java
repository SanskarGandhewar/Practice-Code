package demo4;

public class StudentMain
{
	public static void main(String[] args) 
	{
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.SetData("Sanskar", 22);
		s2.SetDate("Ram",55, "sanskargandhewar12345@gmail.com");
		
		s1.display();
		System.out.println();
		s2.display();
	}
}
