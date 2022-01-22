package InterfaceDemo2;

public class Teacher implements Resume{

	private String name = "Tom";
	private String email = "tom@harvard.edu";
	private String institute = "Harvard"; 

	public Teacher()
	{
		
	}
	
	public Teacher(String name, String institute)
	{
		this.name = name;
		this.email = name + "@" + institute + ".edu";
		this.institute = institute;
	}
	
	public void getBioData() 
	{
		System.out.println("The name of Teacher is " + this.name);
		System.out.println("The email of Teacher is " + this.email);
	}
	
	public void getInstitute()
	{
		// TODO Auto-generated method stub
		System.out.println("The institute is " + this.institute);
	}
	
	public void qualification()
	{
		System.out.println("The teacher is highly qualified");
	}
	
	public void experience()
	{
		System.out.println("The teacher has 5 years of experience");
	}
	
}
