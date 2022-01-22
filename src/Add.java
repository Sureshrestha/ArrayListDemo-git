import java.util.*;

public class Add {

	public static void main(String[] args) {
		//this is a comment
		//this program is going to add two numbers first and then
		// multiplies two numbers
		
		int value1, value2;
		try {
		Scanner input = new Scanner(System.in);
		System.out.print("Plese enter the first number: ");
		value1 = input.nextInt();
		System.out.print("Plese enter the second number: ");
		value2 = input.nextInt();
		
		int sum,product;
		sum = value1 + value2;
		product = value1*value2;
		
		System.out.println("The sum is " + sum);
		System.out.println("The product is " + product);
		
		}
		catch(Exception e)
		{
			
			System.err.println("There is an error\n");
			e.printStackTrace();
			
			
		}

	}

}
