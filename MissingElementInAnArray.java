package week3.day2;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// input array
		int[] arr = { 1, 2, 3, 4, 7, 6, 8 };

		// sort the array
		Arrays.sort(arr);

		// loop through the array (start i from arr[0] till the length of the array)
		for (int i = 0; i < arr.length; i++) {
			// check if the iterator variable is not equal to the array values respectively
			if (arr[i] != i) {
				// print the number
				System.out.println(i);
			}
		}
	}

}
