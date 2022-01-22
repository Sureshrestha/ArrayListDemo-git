package ArrayListDemo;

import java.util.*;

public class ArrayListWithClassDemo
{
	
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		
		Student s1 = new Student("Suresh","8578882648", 24);
		Student s2 = new Student("Tod","888888888", 28);
		Student s3 = new Student("Ram","8578882", 21);
		Student s4 = new Student("GhanaShyam","882648", 22);
		Student s5 = new Student("Bill","8882648", 27);
		Student s6 = new Student("elon","8882648", 29);
		
		//Checking if the list is empty.
		System.out.println(students.isEmpty());
		System.out.println("------------------");
		
		//adding the Values to the arraylist
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
		students.add(s6);
		
		//displaying contents using for loop
		
		for(Student student: students)
		{
			System.out.println(student);
		}
		
		System.out.println("--------------");
		
		// diplaying using for and get
		
		for(int i = 0; i < students.size(); i++ )
		{
			System.out.println(students.get(i));
		}
		
		System.out.println("--------------");
		
		//Creting an iterator to display contents.
		
		Iterator<Student>itr = students.iterator();
		
		//displaying using the iterator
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("--------------");
		
//		//Checking if the list have written value;
		
		System.out.print("Please enter the Student name to check age: ");
		Scanner sn = new Scanner(System.in);
		String value = sn.next();

		System.out.println(value + "'s age is "  + (isEven(students, value)==true? "even" : "odd"));
		
		
	}
	
	//Method to check if student age is even or odd. 
	static boolean isEven(List<Student> stu, String name)
	{
		for(Student student: stu)
		{
			if(student.getName().equals(name))
			{
				if(student.getAge()%2==0)
				return true;
			}
		}
		return false;
	}
	
	//Method to check if student is available
	static boolean isAvailable(List<Student> stu, String name)
	{
		for(Student student: stu)
		{
			if(student.getName().equals(name))
			{
				return true;
			}
		}
		return false;
	}
	
	
	
	
	

}
