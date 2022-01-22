package ArrayListDemo;

import java.util.Objects;

public class Food implements Comparable<Food>{

	String name, color, taste;

	public Food(String name, String color, String taste) {

		this.name = name;
		this.color = color;
		this.taste = taste;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTaste() {
		return taste;
	}

	public void setTaste(String taste) {
		this.taste = taste;
	}

	@Override
	public int hashCode() {
		return Objects.hash(color, name, taste);
	}

	
	@Override
	public String toString() {
		return "Food [name=" + name + ", color=" + color + ", taste=" + taste + "]";
	}

	@Override
	public int compareTo(Food o) {
		
		return this.name.compareTo(o.name);
	}
	
	
	
	
}
