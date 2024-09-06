package demo3;

public class Student 
{
	private String Name;
	private int age;
	private int marks;
	
	public String getName() 
	{
		return Name;
	}
	public void setName(String name) 
	{
		Name = name;
	}
	public int getAge() 
	{
		return age;
	}
	public void setAge(int age) 
	{
		this.age = age;
	}
	public int getMarks() 
	{
		return marks;
	}
	public void setMarks(int marks) 
	{
		this.marks = marks;
	}
	
	public static void main(String[] args) 
	{
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		
		s1.setName("Ram");
		s1.setAge(22);
		s1.setMarks(95);
		
		s2.setName("sham");
		s2.setAge(20);
		s2.setMarks(85);
		
		s3.setName("Sita");
		s3.setAge(19);
		s3.setMarks(80);
		
		System.out.println("Name: "+s1.getName());
		System.out.println("Age: "+s1.getAge());
		System.out.println("Marks: "+s1.getMarks());
		System.out.println();
		
		System.out.println("Name: "+s2.getName());
		System.out.println("Age: "+s2.getAge());
		System.out.println("Marks: "+s2.getMarks());
		System.out.println();
		
		System.out.println("Name: "+s3.getName());
		System.out.println("Age: "+s3.getAge());
		System.out.println("Marks: "+s3.getMarks());
		
	}
}
