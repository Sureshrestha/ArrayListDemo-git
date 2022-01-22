package InterfaceDemo2;

public class Student implements Resume {

	private String name = "Harry";
	private String email = "harry@harvard.edu";
	private String institute = "Harvard"; 

	public Student()
	{
		
	}
	
	public Student(String name, String institute)
	{
		this.name = name;
		this.email = name + "@" + institute + ".edu";
		this.institute = institute;
	}
	
	public void getBioData() {
		System.out.println("The name of Student is " + this.name);
		System.out.println("The email of Student is " + this.email );
	}
	
	public void getInstitute() {
		// TODO Auto-generated method stub
		System.out.println("The institute is " + this.institute);
		
	}
	
	public void branch()
	{
		System.out.println("The student " + name + " belongs to Softaware engineering branch");
	}

	public void result()
	{
		System.out.println(name + " is pass");
	}

}
