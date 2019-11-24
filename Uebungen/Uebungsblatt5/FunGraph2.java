package Uebungsblatt5;

import java.util.function.Function;

public final class FunGraph2 {

	private FunGraph2() {
	}

	static String mkStringGraph(Function<Double, Double> f, int xMin, int xMax,
			int yMin, int yMax) {
		String result = "";
		for (int y = yMin; y < yMax + 1; y++) {
			for (int x = xMin; x < xMax + 1; x++) {
				if (y == 0 && x != 0) {
					result = (f.apply((double) x) < 1
							& f.apply((double) x) > -1) ? "*" + result
									: "-" + result;
				} else if (x == 0) {
					result = "|" + result;
				} else if (f.apply((double) x) < y + 1.33333333
						&& f.apply((double) x) > y - 0.444444) {
					result = "*" + result;
				} else {
					result = " " + result;
				}
//				System.out.println("f(x) -> " + f.apply((double) x) + " x: " + x
//						+ " y: " + y);
			}
			if (y != yMax) {
				result = "\n" + result;
			}
		}
		return result + "\n";
	}

	public static void main(String[] args) {
		System.out.println(
				mkStringGraph(x -> 10 * Math.cos(x / 10), -50, 50, -10, 10));
		System.out.println(mkStringGraph((x) -> x * x, -2, 2, 0, 4));
		System.out.println(mkStringGraph((x) -> x * x * x, -4, 4, 0, 16));
		System.out.println(
				mkStringGraph(x -> 10 * Math.cos(x / 10), -5, 5, 0, 25));
	}
}
