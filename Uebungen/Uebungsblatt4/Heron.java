package Uebungsblatt4;

class Heron {
	static double sqrt(double x) {
		assert x >= 0;
		return sqrt(x, (x + 1) / 2);
	}

	static double sqrt(double x, double approx) {
		return (approx == (double) 1 / 2 * (approx + x / approx)) ? approx
				: sqrt(x, (double) 1 / 2 * (approx + x / approx));
	}

	public static void main(String[] args) {
		System.out.println(sqrt(9));
	}
}
