package Exception;

public class ThrowsDemo {

	static public void divideTwoNumbers(int num1, int num2)
	throws Exception
	{
		System.out.println(num1 / num2);
	}
	
	
	static public void className(String name) throws ClassNotFoundException
	{
		Class.forName(name);
		System.out.println(name);
	}
	
	
	public static void main(String[] args)
	{
		//Calling methods which throws exception using try catch block
		try {
			divideTwoNumbers(1,0);	
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());;
		}
		
		//className("name");
		
		try 
		{
			className("name");
		}
		catch(ClassNotFoundException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
