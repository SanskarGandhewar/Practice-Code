package demo4;

public class Main
{
	public static void main(String[] args) 
	{
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		
		e1.setName("Sanskar");
		e1.setAge(22);
		e1.setId(19);
		
		e2.setName("Ram");
		e2.setAge(25);
		e2.setId(14);
		
		e3.setName("Sita");
		e3.setAge(52);
		e3.setId(54);
		
		System.out.println("Name: "+e1.getName());
		System.out.println("Age: "+e1.getAge());
		System.out.println("Id: "+e1.getId());
		System.out.println();
		
		System.out.println("Name: "+e2.getName());
		System.out.println("Age: "+e2.getAge());
		System.out.println("Id: "+e2.getId());
		System.out.println();
		
		
		System.out.println("Name: "+e3.getName());
		System.out.println("Age: "+e3.getAge());
		System.out.println("Id: "+e3.getId());
	}
}
