package Uebungsblatt4;

class Date {
	int day;
	int month;
	int year;

	Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	int dayOfWeek() {
		if (month < 3) {
			year--;
		}
		int temp = (int) (((day + (2.6 * ((month + 9) % 12 + 1) - 0.2)
				+ year % 100 + (year % 100 / 4) + (year / 400)
				- 2 * (year / 100) - 1) % 7 + 7) % 7 + 1);
		return (temp == 7) ? 0 : temp;
	}

	int dayOfWeekNormal() {
		return (dayOfWeek() == 0) ? 7 : dayOfWeek();
	}

	int countMonth() {
		if (this.month == 1 || this.month == 3 || this.month == 5
				|| this.month == 7 || this.month == 8 || this.month == 10
				|| this.month == 12) {
			return 31;
		} else if (this.month == 2) {
			return (this.isLeapYear()) ? 29 : 28;
		} else {
			return 30;
		}
	}

	Date nextDay() {
		Date tempD = this;
		if (this.day < countMonth()) {
			tempD.day += 1;
			return tempD;
		} else {
			tempD.day = 1;
			if (this.month < 12) {
				tempD.month += 1;
				return tempD;
			} else {
				tempD.month = 1;
				tempD.year += 1;
				return tempD;
			}
		}
	}

	String monthAsHTML() {
		// v gibt wochentag aus, startet mit Montag == 1
		int dayOfWeekNormal = (dayOfWeek() == 0) ? 7 : dayOfWeek();

		String tempMhtml = "<table><tr><th>Mo</th><th>Di</th><th>Mi</th>"
				+ "<th>Do</th><th>Fr</th><th>Sb</th><th>So</th></tr><tr>";

		for (int i = 1; i <= dayOfWeekNormal; i++) {	// leere Tabellenfelder
														// vor
			tempMhtml += "<th></th>"; 					// erstem
		} 												// wochentag im monat

		// v füllt die einzelnen Tabellenfelder mit Zahlen bis anzahl Tage im
		// v Monat
		for (int i = 1; i <= countMonth(); i++) {
			tempMhtml += "<th>" + i + "</th>";
			// v wenn eine Zeile voll ist (7 einträge) neue Zeile machen
			System.out.println(
					"dayOfWeekNormal " + dayOfWeekNormal + " | (i - 1) -> "
							+ (i - 1) + " | dayOfWeekNormal + (i - 1) % 7 -> "
							+ (dayOfWeekNormal + (i - 1) % 7) + " | "
							+ (dayOfWeekNormal + (i - 1)) + " % 7");
			if ((dayOfWeekNormal + (i - 1)) % 7 == 0) {
				tempMhtml += "</tr><tr>";
			}
		}
		// v restliche felder mit leeren tabellenfelden belegen
		for (int i = 0; i <= dayOfWeek(); i++) {
			tempMhtml += "<th></th>";
		}

		return (tempMhtml + "</tr></table>"); // tabelle noch schließen
	}

	Date mothersDay() {
		Date tempMothersDay = this;
		tempMothersDay.month = 5;
		boolean firstSo = true; // für ersten Sonntag im Monat
		for (tempMothersDay.day = 1; tempMothersDay.day < countMonth(); tempMothersDay.day++) {
			if (tempMothersDay.dayOfWeek() == 0) {
				if (!firstSo) {
					return tempMothersDay;
				} else {
					firstSo = false;
				}
			}
		}
		return null;
	}

	public boolean isEarlierThan(Date that) {
		if (this.year < that.year) {
			return true;
		} else if (this.year == that.year) {
			if (this.month < that.month) {
				return true;
			} else if (this.month == that.month) {
				if (this.day < that.day) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean isLaterThan(Date that) {
		if (this.year > that.year) {
			return true;
		} else if (this.year == that.year) {
			if (this.month > that.month) {
				return true;
			} else if (this.month == that.month) {
				if (this.day > that.day) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean isSameDate(Date that) {
		return (that.year == this.year && that.month == this.month
				&& that.day == this.day);
	}

	public boolean isLeapYear() {
		if (year % 4 == 0 && year % 100 != 0) {
			return true;
		} else if (year % 400 != 0) {
			return false;
		}
		return true;
	}

	public int getAbsoluteDaysInYear() {
		return (isLeapYear()) ? 366 : 365;
	}

	public String toString() {
		return day + "." + month + "." + year;
	}

	public static void main(String[] args) {
		Date d1 = new Date(18, 11, 2019);
		System.out.println(d1.dayOfWeek());
		Date d2 = new Date(19, 11, 2019);
		System.out.println(d2.dayOfWeek());
		Date d3 = new Date(20, 11, 2019);
		System.out.println(d3.dayOfWeek());
		Date d4 = new Date(21, 11, 2019);
		System.out.println(d4.dayOfWeek());
		Date d5 = new Date(22, 11, 2018);
		System.out.println(d5.dayOfWeek());
		Date d6 = new Date(23, 11, 2019);
		System.out.println(d6.dayOfWeek());
		Date d7 = new Date(24, 11, 2019);
		System.out.println(d7.dayOfWeek());

		Date d10 = new Date(31, 11, 2019);
		System.out
				.println("Count month " + d10.countMonth() + " day " + d10.day);
		System.out.println(d10.nextDay().toString());

		System.out.println(d10.monthAsHTML());
		
		System.out.println();
		System.out.println(d10.mothersDay().toString());
	}
}