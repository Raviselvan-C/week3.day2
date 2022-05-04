package week3.day2;

public class FindIntersection {

	public static void main(String[] args) {
		// Declare An array for {3,2,11,4,6,7};
		int[] arr1 = { 3, 2, 11, 4, 6, 7 };
		// Declare another array for {1,2,8,4,9,7};
		int[] arr2 = { 1, 2, 8, 4, 9, 7 };

		// Declare for loop iterator from 0 to array length
		for (int i = 0; i < arr1.length; i++) {
			// Declare a nested for another array from 0 to array length
			for (int j = 0; j < arr1.length; j++) {
				int a = arr1[i];
				int b = arr2[j];
				// Compare Both the arrays using a condition statement
				if (a == b) {
					// Print the first array (shoud match item in both arrays)
					System.out.println(arr1[i]);
				}
			}
		}
	}

}
