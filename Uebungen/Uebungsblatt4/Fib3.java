package Uebungsblatt4;

class Fib3 {
	long fib1 = 0;
	long fib2 = 1;

	long nextFib() {
		long tempf1 = fib1;
		long tempf2 = fib2;
		fib2 = fib1 + fib2;
		fib1 = tempf2;
		return tempf1;
	}

	public static void main(String[] args) {
		Fib3 fib = new Fib3();
		for (int i = 0; i <= 10; i = i + 1) {
			System.out.println(fib.nextFib());
		}
	}
}

/* Für Subato:

class Fib {
	long fib1 = 0;
	long fib2 = 1;

	long nextFib() {
		long tempf1 = fib1;
		long tempf2 = fib2;
		fib2 = fib1 + fib2;
		fib1 = tempf2;
		return tempf1;
	}

	public static void main(String[] args) {
		Fib fib = new Fib();
		for (int i = 0; i <= 10; i = i + 1) {
			System.out.println(fib.nextFib());
		}
	}
}

*/