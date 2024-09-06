package demo1;

public class Student
{
	String name;
	int rollNo;
	float marks;
	String address;
	
	public Student(String n,int r,float m,String a) 
	{
		name=n;
		rollNo=r;
		marks=m;
		address=a;
	}
	
	public Student(String n,int r)
	{
		name=n;
		rollNo=r;
	}
	
	public Student(String n) 
	{
		name=n;
	}
	
	public static void main(String[] args) 
	{
		Student s1 = new Student("Sanskar",42,99,"MataNagar");
		System.out.println("Name: "+s1.name);
		System.out.println("RollNo: "+s1.rollNo);
		System.out.println("Marks: "+s1.marks);
		System.out.println("Address: "+s1.address);
		System.out.println();
		
		Student s2 = new Student("Sanskruti",32);
		System.out.println("Name: "+s2.name);
		System.out.println("RollNo: "+s2.rollNo);
		System.out.println();
		
		Student s3 = new Student("Mangesh");
		System.out.println("Name: "+s3.name);
		
		
		
	}
}
