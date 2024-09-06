package Demo;

public class StudentMain 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student("Sanskar",22);
		Student s2 = new Student("Sanskruti",22);
		Student s3 = new Student("Mangesh",27);
		Student s4 = new Student("Surbhi",30);
		Student s5 = new Student("Yogesh",28);
		
		Student s[]= {s1,s2,s3,s4,s5};
		

		System.out.println(s[0].name+" "+s[0].rollNo+" ");
		System.out.println(s[1].name+" "+s[1].rollNo+" ");
		System.out.println(s[2].name+" "+s[2].rollNo+" ");
		System.out.println(s[3].name+" "+s[3].rollNo+" ");
		System.out.println(s[4].name+" "+s[4].rollNo+" ");
		
	}
}
