package week3.day2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ClassroomSessionList {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		Collections.addAll(list, 1, 2, 3, 1, 4, 5, 1, 6);
		int size = list.size();
		int noOf1 = 0;
		for (int i = 0; i < size; i++) {
			if (list.get(i) == 1) {
				noOf1++;
			}
		}
		System.out.println("Number of 1 is " + noOf1);

		List<Character> list2 = new ArrayList<Character>();
		List<Character> list3 = new ArrayList<Character>();
		Collections.addAll(list2, 'A', 'B', 'C', 'D', 'E', 'A', 'G', 'F', 'C');
		int size2 = list2.size();
		for (int i = 0; i < size2; i++) {
			for (int j = i + 1; j < size2; j++) {
				Character a = list2.get(i);
				Character b = list2.get(j);
				if (a.equals(b)) {
					list3.add(a);
				}
			}
		}
		System.out.println("Duplicates values are " + list3);

	}

}
