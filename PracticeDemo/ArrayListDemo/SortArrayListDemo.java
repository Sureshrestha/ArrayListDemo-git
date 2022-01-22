package ArrayListDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArrayListDemo
{

	public static void main(String[] args) {
		
		List<Food> foods = new ArrayList<>();
		
		Food choclate1 = new Food("Dairy Milk","Brown","Sweet");
		Food choclate2 = new Food("Kisses","White","Sweetest");
		Food choclate3 = new Food("Ghiradeli","Dark Brown","Bitter");
		
		foods.add(choclate1);
		foods.add(choclate2);
		foods.add(choclate3);
		
		System.out.println(foods);
		//Sorting using Comparable which just does on the basis of name 
		// and cannot be changed.
		Collections.sort(foods);
		
		//Sorting using comparator using Name
		Collections.sort(foods, new SortFoodUsingName());
		System.out.println(foods);
		
		////Sorting using comparator using Color
		Collections.sort(foods,new SortFoodUsingColor());
		System.out.println(foods);
		
		////Sorting using comparator using Color
		Collections.sort(foods,new SortFoodUsingTaste());
		System.out.println(foods);
	}
}
