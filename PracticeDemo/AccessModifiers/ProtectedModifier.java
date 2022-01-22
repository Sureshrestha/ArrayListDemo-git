package AccessModifiers;

class ProtectedModifier 
{
	protected String name = "Harry";
	protected int age = 21;
	
	public void shoInfo()
	{
		System.out.println("Protected Access Modifier Name: " + name + " Age: " + age);
	}
}

class Child extends ProtectedModifier
{
	public void display()
	{
		shoInfo();
	}
}

class Demo
{
public static void main(String[] args) 
{
	Child ch = new Child();
	ch.display();
}	
}

