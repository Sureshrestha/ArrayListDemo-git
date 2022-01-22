package SuperDemo;

class Animal
{  
	String color="white";  
	
	Animal()
	{
	System.out.println("Animal is created");	
	}
	
	void eat()
	{
		System.out.println("eating.........");
	}

}  

class Dog extends Animal
{  
	String color="black";  
	
	Dog()
	{
		//super(); //calls it even not declared.
		System.out.println("Dog is created");
	}
	
	void eat()
	{
		System.out.println("eating bread..........");
	}
	
	void bark()
	{
		System.out.println("Barking..........");
	}
	
	void work()
	{
		super.eat();
		this.eat();
		bark();
		
	}

	void printColor()
	{  
		System.out.println(color);//prints color of Dog class  
		System.out.println(super.color);//prints color of Animal class  
	}  
}  

class TestSuper1
{  
	public static void main(String args[])
	{  
		Dog d=new Dog();  
		
		System.out.println();
		
		d.printColor(); 
		
		System.out.println();
		
		d.work();
	}
} 
