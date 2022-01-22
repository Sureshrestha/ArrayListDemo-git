package ArrayListDemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListContainsDemo {

	/**
	 * On this we will do contains method on two class objects in which in one we
	 * have defined equals method and one which do not have defined equals method
	 * and see the difference.
	 */

	public static void main(String[] args) {

		/**
		 * creating ArrayList of Dog object. Dog class has equals method overwritten on
		 * it.
		 */
		List<Dog> list = new ArrayList<>();
		Dog d1 = new Dog("tommy", "red", 4);

		// Now adding the created Dog on the list.
		list.add(d1);

		/**
		 * Now creating the dog with same attribute as the one we added in the list
		 */
		Dog d = new Dog("tommy", "red", 4);

		// Now using contains method if the dog is present.

		System.out.println((list.contains(d)) ? "The dog is present" : "The dog is absent");

		/**
		 * creating ArrayList of Food object. Dog class does not have equal method
		 * overwritten on it.
		 */

		List<Food> foods = new ArrayList<>();
		Food choclate1 = new Food("Dairy Milk", "Brown", "Sweet");
		// Now adding the created Food on the foods list.
		foods.add(choclate1);
		
		/**
		 * Now creating the food with same attribute as the 
		 * one we added in the list
		 */
		Food f = new Food("Dairy Milk", "Brown", "Sweet");
		
		// Now using contains method if the food is present.

				System.out.println((foods.contains(f)) ? "The food is present" : "The food is absent");

				/**
				 * Now we can see the variable in output even though
				 * we did the same thing
				 * This is because the default equals method compares the memory
				 * address of two objects instead of comparing values
				 * and when we overwrite an equals method 
				 * in our class we compare the attribute values. 
				 * */
		
	}
}
