package demo4;

public class Student 
{
	String Name;
	int Age;
	String email;
	
	void SetData(String Name,int Age)
	{
		this.Name=Name;
		this.Age=Age;
		
	}
	void SetDate(String Name,int Age,String email)
	{
		this.Name=Name;
		this.Age=Age;
		this.email=email;
	}
	void display()
	{
		System.out.println("Name:" +Name );
		System.out.println("Age: "+Age);
		System.out.println("email: "+email);
	}
}
