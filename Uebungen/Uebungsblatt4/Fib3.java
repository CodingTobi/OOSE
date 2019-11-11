package Uebungsblatt4;

class Fib3 {
	int n = 0;
	long fib1;
	long fib2;

	static int fib(int n) {
	    if (n >= 2) {
	      return fib(n-2) + fib(n-1);
	    }
	    return (n==1) ? 1 : 0;
	  }
	
	long nextFib() {
		fib1 = fib(n);
		fib2 = fib(n + 1);
		n += 2;
		return fib2;
	}

	public static void main(String[] args) {
		Fib3 fib = new Fib3();
		for (int i = 0; i <= 10; i = i + 1) {
			System.out.println(fib.nextFib());
		}
	}
}


