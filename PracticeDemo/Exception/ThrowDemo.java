package Exception;

import java.util.Scanner;

public class ThrowDemo {

	public static void main(String[] args) {

		Scanner sn = new Scanner(System.in);
		int age = sn.nextInt();
		if(age < 18)
			throw new ArithmeticException("Not eligible to vote and drive!!");
		else
			System.out.println("Eligible to vote");
		
	}
}
