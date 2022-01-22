package ArraysDemo;

import java.util.ArrayList;

public class ArrayListDemo {

	
	
	public static void main(String[] args) {
		
		//Three ways of creating arrayList
		
		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList(10);//Arraylist with slot 10
		ArrayList list3 = new ArrayList(list2);// Array list the copy of list2
		
		
		//calling add() method to add value to the string with var arraylist.
			var list = new ArrayList<>();
			list.add("a");
			for(Object s: list)
			{
				System.out.println(s.toString());
				
			}
				
		//calling add method which takes index and value to add on a index
			list.add(0,"help");
			list.add(0 , "HIiiiii");
			list.add(0 , "HIiiiii");
			
			System.out.print(list.toString());
		// using remove() method in two different ways to remove elements
			System.out.println("--------------");
			list.remove("help");
			System.out.println(list.remove(0));
			
			System.out.print(list.toString());
			
			//using isEmpty() and size() method
			//isEmpty checks if the list is empty
			// size returns the size of the list,
			
			System.out.println("");
			System.out.println("--------------");
			System.out.println("Is the list empty?" + list1.isEmpty());
			System.out.println("The size of  list is " + list.size());
			
			//Set() method to set a certain index with an element
			
			System.out.println("--------------");			
			System.out.println(list.set(0,"robin"));
			
			System.out.print(list.toString());
			System.out.println();
			//contains() method which checks the object is contained in an image
			System.out.println("--------------");			
			System.out.println(list.contains("robin"));
			
			
			
		
			
	}
	
}
