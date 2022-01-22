package ArrayListDemo;

import java.util.Comparator;

public class SortFoodUsingColor implements Comparator<Food> {
	@Override
	public int compare(Food o1, Food o2) {
		
		return o1.getColor().compareTo(o2.getColor());
	}
}
