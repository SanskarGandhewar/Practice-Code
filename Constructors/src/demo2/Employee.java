package demo2;
//Overloading ---> Same Method and constructor and different argument
public class Employee 
{
	String name;
	float salary;
	int id;
	
	public Employee(String n)
	{
		name=n;
	}
	public Employee(String n,float s) 
	{
		name=n;
		salary=s;	
	}
	
	public Employee(String n,float s,int i)
	{
		name=n;
		salary=s;
		id=i;
	}
	
	public void ShowDisplay()
	{
		System.out.println("Name: "+name);
		System.out.println("Salary: "+salary);
		System.out.println();
	}
	
	public void showData()
	{

		System.out.println("Name: "+name);
		System.out.println("Salary: "+salary);
		System.out.println("Id: "+id);
		System.out.println();
	}
	
	public void showData(int i)
	{
		System.out.println("Id: "+i);
	}
	
	public static void main(String[] args) 
	{
		Employee e1 = new Employee("Sanskar",97845.5f);
		e1.ShowDisplay();
		
		Employee e2 = new Employee("Sanskruti",97572.8f);
		e2.ShowDisplay();
		
		Employee e3 = new Employee("Mangesh",98758.3f);
		e3.ShowDisplay();
		
		Employee e4 = new Employee("Surbhi",98578.2f,45);
		e4.showData();
		
		Employee e5 = new Employee("Yogesh",97245.4f,15);
		e5.showData(78);
		e5.ShowDisplay();
		
		
	}
}
