package Uebungsblatt5;

import java.lang.AssertionError;

public class MoreSimpleArrayFuns {

	private MoreSimpleArrayFuns() {
	}

	static int firstIndex(int[] xs, int y) {
		for (int i = 0; i < xs.length; i++) {
			if (xs[i] == y)
				return i;
		}
		return -1;
	}

	static boolean startsWith(int[] prefix, int[] xs) {
		for (int i = 0; i < prefix.length; i++) {
			if (xs.length == 0 || xs[i] != prefix[i])
				return false;
		}
		return true;
	}

	static void replace(int[] xs, int oldI, int newI) {
		while (firstIndex(xs, oldI) != -1) {
			xs[firstIndex(xs, oldI)] = newI;
		}
	}

	static void reverse(int[] xs) {
		for (int i = 0; i < (xs.length / 2); i++) {
			int temp = xs[i];
			xs[i] = xs[xs.length - i - 1];
			xs[xs.length - i - 1] = temp;
		}
	}

	static int[] getSubArray(int[] xs, int startIndex, int length) {
		if (xs.length > 0 && startIndex < xs.length
				&& xs.length > startIndex + length) {
			int[] temp = new int[length];
			for (int i = startIndex; i < startIndex + length; i++) {
				temp[i - startIndex] = xs[i];
			}
			return temp;
		}
		int[] test = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		return test;
	}

	public static void main(String[] args) {
		int[] testA = {};
		int[] testB = {};
		int[] testC = new int[0];
		int[] testD = null;
		// System.out.println(firstIndex(testA, 9));
		System.out.println(startsWith(testA, testB));
		System.out.println(startsWith(testC, testD));
		// replace(testA, 2, 45);
		// reverse(testA);
		// printArr(getSubArray(testA, 4, 7));
	}
}

//static void printArr(int[] x) {
//	for (int y : x)
//		System.out.print(y + ", ");
//	System.out.println();
//}
//
