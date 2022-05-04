package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
		// Input Array
		int[] data = { 3, 2, 11, 4, 6, 7 };
		// find the index value of 2nd largest number
		int secondBigNumber = data.length - 2;

		// method1: convert Array to ArrayList and sort easily
		// Create a new list
		List<Integer> list = new ArrayList<Integer>();

		// convert Array to ArrayList
		for (int i = 0; i < data.length; i++) {

			int a = data[i];
			list.add(a);
		}

		// sort the ArrayList
		Collections.sort(list);
		// print the secondLargest Number using the ArrayList index value
		System.out.println("Method1: The Second Largest Number is " + list.get(secondBigNumber));

		// method2 ascending array without list
		int temp = 0;

		for (int i = 0; i < data.length; i++) {
			for (int j = i + 1; j < data.length; j++) {
				if (data[i] > data[j]) {
					temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
		}

		System.out.println("Method2: The Second Largest Number is " + data[secondBigNumber]);

	}

}
