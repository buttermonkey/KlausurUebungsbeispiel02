package org.campus02.arrays;

import java.util.Arrays;

public class TestApp {
	public static void main(String[] args) {
		int[] arr = new int[]{ 8, 5, 1, 9, 0, 4 };
		ArrayHelper.arrangeOrder(arr);
		System.out.println("arr = " + Arrays.toString(arr));
	}
}
