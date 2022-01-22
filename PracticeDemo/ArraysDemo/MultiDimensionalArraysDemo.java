package ArraysDemo;

import java.util.Iterator;

public class MultiDimensionalArraysDemo {

	//Creating a simple multiDimensional array
	public static void main(String[] args) {
		int[][] twoD = new int[2][];
		twoD[0] = new int[3];
		twoD[1] = new int [5];

		for(int i = 0; i < 3; i++)
		{
			twoD[0][i] = i;
		}
		
		for(int i = 0; i < 5; i++)
		{
			twoD[1][i] = i;
		}
	
		System.out.println("Completed");
		//Printing multidimenisional array with standard for loop
		System.out.println(twoD.length);
		System.out.println(twoD[1].length);
		for(int j = 0; j < twoD.length; j++)
		{
		for(int i = 0; i < twoD[j].length; i++)
		{
			System.out.println(twoD[j][i]);
		}
		
		}
		
		System.out.println("------------------");
		//Printing multi Dimensional array with collection for loop
		for(int[] inner: twoD)
		{
			for(int num: inner)
			{
				System.out.print(num + "    ");
			}
			System.out.println();
		}
	}
	
	
}
