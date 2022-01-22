package ArrayListDemo;

public class Student {

	private String name, phNumber;
	private int age;
	
	public Student()
	{
		this.name = "";
		this.phNumber = "";
		this.age = 0;
		
		 
	}
	
	public Student(String name, String phNumber, int age)
	{
		this.name = name;
		this.phNumber = phNumber;
		this.age = age;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhNumber() {
		return phNumber;
	}
	public void setPhNumber(String phNumber) {
		this.phNumber = phNumber;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", phNumber=" + phNumber + ", age=" + age + "]";
	}

	
}
