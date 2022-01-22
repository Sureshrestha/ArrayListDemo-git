package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo 
{
	public static void main(String[] args) {
		int num = 1;
		Scanner sn = new Scanner(System.in);
		String s = null;
		
		try {
			System.out.println(5/num);
			System.out.print("Please enter new value for num: ");
				num = sn.nextInt();
				num = s.length();
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
			System.out.println(e instanceof RuntimeException);
		}
		catch(InputMismatchException e)
		{
			e.printStackTrace();
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
		}
		finally {
			System.out.println("This is true");
		}
		System.out.println("Value");
	}

}
