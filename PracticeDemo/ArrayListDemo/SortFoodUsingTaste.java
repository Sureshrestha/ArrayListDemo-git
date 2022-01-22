package ArrayListDemo;

import java.util.Comparator;

public class SortFoodUsingTaste implements Comparator<Food> {

	@Override
	public int compare(Food o1, Food o2) {
		
		return o1.getTaste().compareTo(o2.getTaste());
	}
}
