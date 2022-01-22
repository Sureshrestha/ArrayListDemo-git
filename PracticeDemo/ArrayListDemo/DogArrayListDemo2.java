package ArrayListDemo;

import java.util.*;

public class DogArrayListDemo2 implements Comparator<Dog>{

	public static void main(String[] args) {
		
		List<Dog> list = new ArrayList<>();
		Dog d1 = new Dog("tommy","red",4);
		Dog d2 = new Dog("sweety","white",14);
		Dog d3 = new Dog("manky","black",7);
		
		//Adding elements to the list
		list.add(d1);
		list.add(d2);
		list.add(d3);
		
		System.out.println(list);
	
		
		
		Collections.sort(list,new DogArrayListDemo2());
		
	
			System.out.println(list);
		
		//Comparable is for default sorting
		//Custon sorting is done in comparator and create multiple way to sort an object. 
		//Using contains to check if the list contain the element address
		//Contains gives true if both of them have same address
		//To get comparing by value we need to overwrite equals method. 
		Dog d = new Dog("tommy","red",4);
		System.out.println(list.contains(d));
		if(d==d1)
		{
			System.out.println(true);
		}
		
	}
	
	@Override
	public int compare(Dog o1, Dog o2) {
		int i = (o1.name.compareTo(o2.name));
		
			
		
		return i;
	}
}
