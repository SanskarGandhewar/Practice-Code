package demo6;

public class BANKTEST
{
	public static void main(String[] args) 
	{
		Bank b = new Bank();
		Bank b1 = new SBIBANK();
		Bank b2 = new AXISBANK();
		Bank b3 = new ICICIBANK();
		
		b.getRateOfInterest();
		b1.getRateOfInterest();
		b2.getRateOfInterest();
		b3.getRateOfInterest();
		
		System.out.println("Bank: "+b.getRateOfInterest()+"%");
		System.out.println("SBIBANK: "+b1.getRateOfInterest()+"%");
		System.out.println("AXISBANK: "+b2.getRateOfInterest()+"%");
		System.out.println("ICICIBANK: "+b3.getRateOfInterest()+"%");
		
		
		
		
	}
}
