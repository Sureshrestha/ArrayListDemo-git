package ArraysDemo;

import java.util.Arrays;

public class ArraysDemo {
	public static void main(String[] args) {

		// Creating and displaying the array.
		int[] numbers = new int[3];
		int[] numbers2 = { 10, 20, 30 };
		String[] words = { "Hari", "Apple", "Guava" };

		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers2[i]);
		}

		System.out.println(numbers.toString());

		String names[] = new String[2];

		// showing hashCode of array created
		System.out.println(names.toString());

		// for loop
		System.out.println("-----------------------------");
		for (String word : words) {
			System.out.println(word);
		}

		// Sorting the array words
		Arrays.sort(words);
		System.out.println("-----------------------------");
		for (String word : words) {
			System.out.println(word);
		}

		// Binary Searching arrays
		System.out.println("-----------------------------");
		System.out.println(Arrays.binarySearch(words, "Guava"));
		System.out.println(Arrays.binarySearch(words, "Apple"));

		// BinarySearching Unsorted array
		System.out.println("-----------------------------");
		String[] words2 = { "Hari", "Apple", "Guava", "Pears"};
		System.out.println(Arrays.binarySearch(words2, "Guava"));
		System.out.println(Arrays.binarySearch(words2, "Pears"));
		
		Arrays.sort(words2);
		
		//compare() Arrays
		System.out.println("-----------------------------");
		System.out.println(Arrays.compare(words2, words));
		
		String[] words3 = { "Hari", "Apple"};
		
		//mismatch() Arrays
		System.out.println("-----------------------------");
		System.out.println(Arrays.mismatch(words, words2));
		System.out.println(Arrays.mismatch(words, words3));
		Arrays.sort(words3);
		System.out.println(Arrays.mismatch(words, words3));
		System.out.println("-----------------------------");
		
	
	}
}
