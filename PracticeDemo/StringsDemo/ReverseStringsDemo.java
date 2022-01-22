package StringsDemo;

import java.util.Scanner;

public class ReverseStringsDemo {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the name to reverse:");
		String value = input.nextLine();
		
		String reversed = reverse(value);
		System.out.println("The reverse for " + value + " is " + reversed);
		System.out.println("The reversed word is " + reverseWords(value));

		System.out.println("#########");
		
		System.out.println(value + ((isPalindrome(value)?" is Palindrome" : " is not Palindrome")));
		
		System.out.println("The occurence of a is: " + countOccurence(value, 'a'));
		
		reverseUsingSplit(value);
		
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
	
	static String reverseWords(String words)
	{
		int num = words.length();
		String value = "";
		for(int i = words.length()-1; i >=0; i--)
		{ 
			if(words.charAt(i) == ' ' || i == 0)
			{  
				if(i ==0)
				{
					value += " ";
				}
				
				for (int j = i; j < num; j ++)
				{
					
					value += words.charAt(j);
				}
				num = i;
			}
		}
		
		return value;
	}
	
	static void reverseUsingSplit(String name)
	{
		System.out.println("****************************");
		String[] s = name.split(" ");
		for(int i = s.length-1 ; i >=0 ; i--)
		{
			System.out.print(s[i] + " ");
		}
		
	}
	
	static boolean isPalindrome(String value)
	{
		if(value.equals(reverse(value)))
		{
			return true;
		}
		else 
			return false;
	}
	
	static int countOccurence(String value, char word)
	{
		int count = 0;
		for(int i = 0; i < value.length(); i++)
		{
			if(value.charAt(i) == word)
				count++;
		}
			
		return count;
	}
}
