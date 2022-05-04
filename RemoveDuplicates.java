package week3.day2;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// Use the declared String text as input
		String text = "We learn java basics as part of java sessions in java week1";

		// Initialize an integer variable as count
		int count = 0;

		// Split the String into array and iterate over it
		String[] arr = text.split(" ");

		for (int i = 0; i < arr.length; i++) {
			String a = arr[i];
			// Initialize another loop to check whether the word is there in the array
			for (int j = i + 1; j < arr.length; j++) {
				String b = arr[j];
				// if it is available then increase and count by 1.
				if (a.equals(b)) {
					count++;
					// if the count > 1 then replace the word as ""
					if (count > 0) {
						arr[i] = "";
						arr[j] = "";
					}
				}
			}

		}
		// Displaying the String without duplicate words
		System.out.println("Below is the String without Duplicates");
		for (String eachArray : arr) {
			System.out.print(eachArray);
			System.out.print(" ");
		}

	}

}
