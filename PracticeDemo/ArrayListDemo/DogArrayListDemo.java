package ArrayListDemo;

import java.util.*;

public class DogArrayListDemo {

	public static void main(String[] args) {
		
		List<Dog> list = new ArrayList<>();
		Dog d1 = new Dog("tommy","red",4);
		Dog d2 = new Dog("sweety","white",14);
		Dog d3 = new Dog("manky","black",7);
		
		//Adding elements to the list
		list.add(d1);
		list.add(d2);
		list.add(d3);
		
		for(Dog d: list)
		{
			System.out.println(d);
		}
		
		// For this method to called we need to specify which variable to compare
		// For that we create a compareTo method inside Dog class. 
		// After that the method below will sort the list on age as we created
		// compareTo on the basis of age.  
		
//		@Override
//		public int compareTo(Dog d) {
//			
//			return this.age- d.age;
//		}
		
		Collections.sort(list);
		
		//If we have to sort in descending order we just change the age like
//		@Override
//		public int compareTo(Dog d) {
//			
//			return d.age - this.ages;
//		}
		
		for(Dog d: list)
		{
			System.out.println(d);
		}
		
		//Using contains to check if the list contain the element addess
		//Contains gives true if both of them have same address
		//To get comparing by value we need to overwrite equals method. 
		Dog d = new Dog("tommy","red",4);
		System.out.println(list.contains(d));
		if(d==d1)
		{
			System.out.println(true);
		}
		
	}
	
	static void search(String name)
	{
		
	}
}
