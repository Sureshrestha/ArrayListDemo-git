package StringDemo;

public class StringMethodsDemo {
	public static void main(String[] args) {

		String s1 = "Co" + "ol";
		String s2 = "Ence";

		String s8 = 1 + 4 + "Shayam" + 2;
		String s3 = new String("Navi");

		System.out.println("-----------------------------------");
		System.out.println(s8);
		
		System.out.println("-----------------------------------");
		String upper = s1.toUpperCase();
		String lower = s1.toLowerCase();
		System.out.println("-----------------------------------");
		// Upper case and lower case
		System.out.println("Uppercase of " + s1 + " is " + upper);
		System.out.println("Lowercase of " + s1 + " is " + lower);
		System.out.println("-----------------------------------");
		// Length of string
		System.out.println("Length of String " + s1 + " is " + s1.length());
		System.out.println("Length of String " + s2 + " is " + s2.length());
		System.out.println("-----------------------------------");
		// CharAt Method
		System.out.println("At 3rd index of String " + s1 + " is " + s1.charAt(3));
		System.out.println("-----------------------------------");
		// indexOF method
		System.out.println("THe char o is present in " + s1.indexOf('o') + " index of " + s1 + " string.");
		System.out.println("The 2nd char o is present in " + s1.indexOf('o', 2) + " index of " + s1 + " string.");
		System.out.println("-----------------------------------");
		// subString() method
		// 0c-1o-2o-3l-4
		String s4 = s1.substring(1, 4);
		System.out.println(s4);

		System.out.println("-----------------------------------");
		// equals and equalsIgnoreCase() Method
		System.out.println("cool".equals(s1));
		System.out.println("cool".equalsIgnoreCase(s1));

		// startsWith() and endsWith Methods
		System.out.println("-----------------------------------");
		System.out.println(s1.startsWith("c"));
		System.out.println(s1.startsWith("C"));
		System.out.println(s1.endsWith("l"));
		System.out.println(s1.endsWith("L"));

		// replace() method
		System.out.println("-----------------------------------");
		System.out.println(s1.replace('o', 'O'));
		System.out.println(s1.replace("ol", "OOOOOOOOOOOOOOL"));
		System.out.println(s1);
		System.out.println("-----------------------------------");

		// contains() Method
		System.out.println(s1.contains("c"));
		System.out.println(s1.contains("C"));

		// trim, strip, stripLeading, stripTrailing Method
		System.out.println("-----------------------------------");
		String test = "         abc      \t";
		System.out.println(test.length());
		System.out.println(test.trim());
		System.out.println(test.strip());
		System.out.println(test.stripLeading().length());
		System.out.println(test.stripTrailing().length());
		System.out.println("-----------------------------------");
		// Practicing stringPool

		String x = "Hello World";
		String y = "Hello World";
		String z = new String("Hello World");
		String a = " Hello World".trim();

		System.out.println(x == y);
		System.out.println(x == z);
		System.out.println(x == a);
		System.out.println("-----------------------------------");
		// Practicing split() method
		String strToken[] = x.split(" ");
		for (String t : strToken) {
			System.out.println(t);
		}

	}

}
