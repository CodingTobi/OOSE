package Uebungsblatt5;

public final class FunGraph {
	private FunGraph() {
	}

	// static String mkStringGraph(int xMin, int xMax, int yMin, int yMax) {
	// String result = "";
	// int rowL = (int) (xMax + Math.sqrt(xMin * xMin));
	//
	// for (int y = yMin; y < yMax; y++) {
	// if (y == 0) {
	// if (xMin < 0) {
	// if (xMax >= 0) {
	// result = printTimes('-', 0 - xMin) + "*" + printTimes('-', xMax);
	// } else {
	// result = printTimes('-', xMax - xMin);
	// }
	// } else {
	// result = printTimes('-', xMax - xMin);
	// }
	// } else {
	// for (int x = xMin; x < rowL; x++) {
	// if (y*y==)
	// }
	// }
	// }
	//
	// return result;
	// }

	static String mkStringGraph(int xMin, int xMax, int yMin, int yMax) {
		String result = "";
		int rowL = (int) (xMax + Math.sqrt(xMin * xMin)) + 1;

		for (int x = xMin; x < xMax; x++) {
			if (x == 0) {
				if (xMin < 0) {
					if (xMax >= 0) {
						result = printTimes('-', 0 - xMin) + "*"
								+ printTimes('-', xMax);
					} else {
						result = printTimes('-', xMax - xMin);
					}
				} else {
					result = printTimes('-', xMax - xMin);
				}
				result += "\n";
				continue;
			}
			String tempRow = "";
			for (int i = 1; i < rowL; i++) {
				System.out.println("i: " + i + "  rowL: " + rowL + " x: " + x);
				if (i == (rowL - xMax) - x || i == (rowL - xMax) + x) {
					System.out.println("* i: " + i + "  rowL: " + rowL
							+ " xMax: " + xMax + " x: " + x);
					tempRow += "*";
				} else if (i == (rowL - xMax)) {
					System.out.println(
							"| i: " + i + "  rowL: " + rowL + " x: " + x);
					tempRow += "|";
				} else {
					tempRow += " ";
				}
			}
			result = multiplyRow(tempRow + "\n",
					(int) (Math.pow(x + 1, 2) - 1) - (int) (Math.pow(x, 2) - 1))
					+ result;
		}
		return result;
	}

	private static String multiplyRow(String string, int d) {
		System.out.println(d);
		String tempS = string;
		for (int i = 1; i < d; i++) {
			tempS += string;
		}
		return tempS;
	}

	static String printTimes(char x, int times) {
		String tempS = "";
		for (int i = 0; i < times; i++) {
			tempS += x;
		}
		return tempS;
	}

	public static void main(String[] args) {
		System.out.println(mkStringGraph(-2, 2, 0, 4));
		System.out.println(mkStringGraph(-4, 4, 0, 16));
		System.out.println(mkStringGraph(-5, 5, 0, 25));
	}

}
