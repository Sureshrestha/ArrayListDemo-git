package ArrayListDemo;

import java.util.*;

public class ArrayListDemo {
	public static void main(String[] args) {
		// crating arraylist of name students;
		List<String> students = new ArrayList<>();

		// checking if the arraylist is empty
		System.out.println(students.isEmpty());

		// adding values on arraylist
		students.add("Abhisekh");
		students.add("Sunil");
		students.add("Suresh");
		students.add("Aayush");
		students.add("Saajan");

		// checking if the arraylist is empty
		System.out.println(students.isEmpty());
		
		// finding the  index of word Suresh in arraylist
		
		System.out.println(students.indexOf("Suresh"));
		
		// Creating the iterator for the arraylist 
		Iterator<String> itr = students.iterator();
		
		System.out.println("------------------------");
		
		//Printing the iterator
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("------------------------");
		
		//using get and for loop to print the whole list.
		
		for(String value: students)
		{
			
			System.out.println(value);
		}
		
	}

}
