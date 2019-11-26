package Uebungsblatt6;

class FactorialLogic extends ButtonLogic {

	public static void main(String[] args) {
		// new Dialogue(new FactorialLogic());
		new ConsoleDialogue(new FactorialLogic()).run();
	}

	@Override
	String getButtonLabel() {
		return "Calculate Factorial";
	}

	@Override
	String eval(String x) {
		return BigIntegerFactorial.factorial(Long.valueOf(x)).toString();
	}
}