package ArrayListDemo;

import java.util.Objects;

public class Dog implements Comparable<Dog> {

	String name, color;
	int age;
	
	public Dog()
	{
		
	}
	
	public Dog(String name, String color, int age) {
		this.name = name;
		this.color = color;
		this.age = age;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	
	@Override
	public int hashCode() {
		return Objects.hash(age, color, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		return age == other.age && Objects.equals(color, other.color) && Objects.equals(name, other.name);
	}

	
	
	@Override
	public String toString() {
		return "Dog [name=" + name + ", color=" + color + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Dog d) {
		
		return this.age- d.age;
	}
	
	
	
	
}
