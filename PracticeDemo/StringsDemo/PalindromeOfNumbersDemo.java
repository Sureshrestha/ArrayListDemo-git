package StringsDemo;

import java.util.Scanner;

public class PalindromeOfNumbersDemo {
	
	public static void main(String[] args) {
		
		int value;
		Scanner input = new Scanner(System.in);
		System.out.print("Please provide the number to check Palindrome: ");
		value = input.nextInt();
	
		isPalindrome(value);
		
		
	}
	
	static int reverseInt (int value)
	{	int reverseNumber = 0;
		int number = value;
	while(number !=0 )
	{
		reverseNumber *= 10;
		reverseNumber += (number%10);
		number /= 10;
	}
	
		return reverseNumber;
	}

	static void isPalindrome(int value)
	{
		if(value == reverseInt(value))
		{
			System.out.println("The number " + value + " is Palindrome");
		}
		else
			System.out.println("The number " + value + "is not Palindrome");
	}
}
