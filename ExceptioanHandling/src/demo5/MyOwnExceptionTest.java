package demo5;

public class MyOwnExceptionTest
{
	 static void employeeAge(int age) throws MyOwnException
	{
		if(age<0)
		{
			throw new MyOwnException("Age cant be less than zero");
		}
		else
		{
			System.out.println("Input is Valid");
		}
	}
}
