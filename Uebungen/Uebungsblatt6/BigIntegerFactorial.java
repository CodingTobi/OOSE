package Uebungsblatt6;

import java.math.BigInteger;

public final class BigIntegerFactorial {

	private BigIntegerFactorial() {
	}

	static BigInteger factorial(long n) {
		BigInteger result = BigInteger.ONE;
		for (int i = 2; i <= n; i++) {
			result = result.multiply(BigInteger.valueOf(i));
		}
		return result;
	}
}