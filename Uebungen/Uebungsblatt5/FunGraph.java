package Uebungsblatt5;

public final class FunGraph {

	private FunGraph() {
	}

	static String mkStringGraph(int xMin, int xMax, int yMin, int yMax) {
		String result = "";
		int position = 0;

		for (int y = yMin; y < yMax + 1; y++) {
			for (int x = xMin; x < xMax + 1; x++) {
				if (y == 0) {
					result = (x == 0) ? "*" + result : "-" + result;
				} else if (x == 0) {
					result = "|" + result;
				} else if (y == x * x) {
					result = "*" + result;
					position = x;
				} else if (position == Math.sqrt(x * x)) {
					result = "*" + result;
				} else {
					result = " " + result;
				}
			}
			if (y != yMax) {
				result = "\n" + result;
			}
		}
		return result + "\n";
	}

	public static void main(String[] args) {
		System.out.println(mkStringGraph(-4, 4, 0, 16));
		// System.out.println(mkStringGraph3(-5, 5, 0, 25));
	}
}
