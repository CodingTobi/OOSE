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
		String[] temp = x.split("\\.");
		int dayNr = new Date(Integer.valueOf(temp[0]), Integer.valueOf(temp[1]),
				Integer.valueOf(temp[2])).dayOfWeek();
		switch (dayNr) {
			case 0:
				return "Sonntag";
			case 1:
				return "Montag";
			case 2:
				return "Dienstag";
			case 3:
				return "Mittwoch";
			case 4:
				return "Donnerstag";
			case 5:
				return "Freitag";
			case 6:
				return "Sonnabend";
			default:
				return "Error";
		}
		
	}
}