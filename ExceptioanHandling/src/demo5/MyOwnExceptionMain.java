package demo5;

public class MyOwnExceptionMain 
{
	public static void main(String[] args) 
	{
		try {
			MyOwnExceptionTest.employeeAge(6);
			MyOwnExceptionTest.employeeAge(-5);
		} 
		catch (MyOwnException e) 
		{
			System.out.println(e.getMessage());
		}
	}
}
