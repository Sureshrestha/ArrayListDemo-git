package ArrayListDemo;

import java.util.Comparator;

public class SortFoodUsingName implements Comparator<Food> {

	@Override
	public int compare(Food o1, Food o2) {
		
		return o1.getName().compareTo(o2.getName());
	}

}
