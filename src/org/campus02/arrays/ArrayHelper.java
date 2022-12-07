package org.campus02.arrays;

public class ArrayHelper {
	public static void arrangeOrder (int[] numbers) {
		boolean sorted = false;
		while (!sorted) {
			sorted = true;
			for (int i = 1; i < numbers.length; i++) {
				if (numbers[i - 1] > numbers[i]) {
					int temp = numbers[i - 1];
					numbers[i - 1] = numbers[i];
					numbers[i] = temp;
					sorted = false;
				}
			}
		}
	}
}
