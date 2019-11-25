package Uebungsblatt6;

class ToUpperLogic extends ButtonLogic {

	public static void main(String[] args) {
		// new Dialogue(new ToUpperLogic());
		new ConsoleDialogue(new ToUpperLogic()).run();
	}

	@Override
	String getButtonLabel() {
		return "convert to Uppercase";
	}

	@Override
	String eval(String x) {
		return x.toUpperCase();
	}
}