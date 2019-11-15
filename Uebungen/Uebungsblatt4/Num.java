package Uebungsblatt4;

class Num {
	// n is assumed to be a positive number
	final long n;

	Num(long n) {
		assert n >= 0;
		this.n = n;
	}

	String toBin() {
		return toBase(2);
	}

	String toOct() {
		return toBase(8);
	}

	String toBase(int b) {
		return (n > 0) ? "" + new Num(n / b).toBase(b) + getDigit(n % b) : "0";
	}

	String toBase2(int b) {
		System.out.println("n " + n + "  n%2 " + n % 2 + "   n/2 " + n / 2);
		int temp = (int) n % b;
		if (n / b != 0) {
			String result = new Num(n / b).toBase2(b);
			result += getDigit(temp);
			return result;
		}
		return "0" + getDigit(temp);
	}

	static char getDigit(long d) {
		return (char) (d < 10 ? '0' + d : 'A' + d - 10);
	}

	public static void main(String[] args) {
		System.out.println(new Num(42).toBase(16));
		System.out.println(new Num(42).toBase2(16));
		System.out.println(new Num(8).toOct());
	}

	String toOctA() {
		return (n > 0) ? "" + new Num(n / 8).toOct() + n % 8 : "0";
	}

	String toBinA() {
		return (n > 0) ? "" + new Num(n / 2).toBin() + n % 2 : "0";
	}
}
