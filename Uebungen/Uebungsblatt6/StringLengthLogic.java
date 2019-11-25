package Uebungsblatt6;

class StringLengthLogic extends ButtonLogic {

	public static void main(String[] args) {
		// new Dialogue(new StringLengthLogic());
		new ConsoleDialogue(new StringLengthLogic()).run();
	}

	@Override
	String getButtonLabel() {
		return "get String length";
	}

	@Override
	String eval(String x) {
		return String.valueOf(x.length());
	}
}