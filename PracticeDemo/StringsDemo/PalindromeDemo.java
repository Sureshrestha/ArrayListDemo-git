package StringsDemo;

import java.util.Scanner;

public class PalindromeDemo {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input: str = \"abba\"");
		isPalindrome("abba");
		
		System.out.println("Input: str = \"geeks\"");
		isPalindrome("abba");
		
		
	}
	
	static String reverse(String name)
	{
		String value = "";
		
		for(int i = name.length()-1; i >= 0 ; i--)
		{
			value += name.charAt(i);
		}
		return value;		
	}
	static void isPalindrome(String value)
	{
		if(value.equals(reverse(value)))
		{
			System.out.println("Output: Yes");
		}
		else 
			System.out.println("Output: No");
	}
	
}
