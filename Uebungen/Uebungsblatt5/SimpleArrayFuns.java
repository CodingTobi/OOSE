package Uebungsblatt5;

public final class SimpleArrayFuns {

	private SimpleArrayFuns() {
	}

	static boolean contains(int[] xs, int y) {
		for (int x : xs) {
			if (x == y)
				return true;
		}
		return false;
	}

	static long sum(int[] xs) {
		long tempL = 0;
		for (long x : xs) {
			tempL += x;
		}
		return tempL;
	}

	static int avg(int[] xs) {
		return (xs.length != 0) ? (int) (sum(xs) / xs.length) : 0;
	}

	static boolean isSorted(int[] xs) {
		for (int i = 0; i < xs.length - 1; i++) {
			if (xs[i] > xs[i + 1])
				return false;
		}
		return true;
	}

	static int max(int[] xs) {
		if (xs.length > 0) {
			int tempMax = xs[0];
			System.out.println("l " + xs.length);
			for (int i = 1; i < xs.length; i++) {
				System.out.println("l " + xs.length + " i - " + i);
				if (xs[i] > tempMax)
					tempMax = xs[i];
			}
			return tempMax;
		}
		return -2147483648;
	}

	public static void main(String[] args) {
		int[] testA = {};
		System.out.println(contains(testA, 9));
		System.out.println(sum(testA));
		System.out.println(avg(testA));
		System.out.println(max(testA));
		System.out.println(isSorted(testA));
	}
}