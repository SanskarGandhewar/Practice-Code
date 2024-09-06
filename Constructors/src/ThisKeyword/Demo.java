package ThisKeyword;

public class Demo
{
	int num;
	
	public Demo(int num)
	{
		this.num=num;
	}
	
	public void show() 
	{
		System.out.println("The Given Number is: "+num);
	}
	
	public static void main(String[] args) 
	{
		Demo d = new Demo(98);
		d.show();
	}
}
