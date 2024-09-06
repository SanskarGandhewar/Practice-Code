package Demo5;

public class Test 
{
	public static void main(String[] args) 
	{
		Encapsulate e = new Encapsulate();
		e.setName("Sanskar");
		e.setAge(22);
		e.setRollNo(42);
		
		System.out.println("Name: "+e.getName());
		System.out.println("Age: "+e.getAge());
		System.out.println("RollNo: "+e.getRollNo());
	}
}
