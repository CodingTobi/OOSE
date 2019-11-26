package Uebungsblatt6;

class DayOfWeekLogic extends ButtonLogic {

	public static void main(String[] args) {
		// new Dialogue(new DayOfWeekLogic());
		new ConsoleDialogue(new DayOfWeekLogic()).run();
	}

	@Override
	String getButtonLabel() {
		return "Get day of week";
	}

	@Override
	String eval(String x) {
		String[] temp = x.split(".");
		System.out.println(Integer.valueOf(temp[0]));
		return "" + new Date(Integer.valueOf(temp[0]),
				Integer.valueOf(temp[1]), Integer.valueOf(temp[2])).dayOfWeek();
	}
}