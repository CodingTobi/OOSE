package Uebungsblatt5;

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
		int m = month;
		if (m < 3) {
			m += 10;
		} else {
			m -= 2;
		}

		int y = year % 100;
		if (month < 3) {
			if (y == 0) {
				y = 99;
			} else {
				y -= 1;
			}
		}
		int c = year / 100;
		if (month < 3 && year % 100 == 0) {
			c -= 1;
		}
		int result = (int) ((day + Math.floor(2.6 * m - 0.2) + y)
				+ (Math.floor(y / 4) + Math.floor(c / 4) - 2 * c));
		result %= 7;
		return (result >= 0) ? (int) result : (int) result + 7;
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
		Date anfangMonat = this;
		anfangMonat.day = 1;
		int dayOfWeekNormal = (anfangMonat.dayOfWeek() == 0) ? 7
				: anfangMonat.dayOfWeek();
		String tempMhtml = "<table><tr><th>Mo</th><th>Di</th><th>Mi</th>"
				+ "<th>Do</th><th>Fr</th><th>Sb</th><th>So</th></tr><tr>";

		for (int i = 1; i < dayOfWeekNormal; i++) {	// leere Tabellenfelder
														// vor
			tempMhtml += "<td></td>"; 					// erstem
		} 												// wochentag im monat

		// v füllt die einzelnen Tabellenfelder mit Zahlen bis anzahl Tage im
		// v Monat
		for (int i = 1; i <= countMonth(); i++) {
			tempMhtml += "<td>" + i + "</td>";
			// v wenn eine Zeile voll ist (7 einträge) neue Zeile machen
			if ((dayOfWeekNormal + (i - 1)) % 7 == 0 && i < countMonth()) {
				tempMhtml += "</tr><tr>";
			}
		}
		return (tempMhtml + "</tr></table>"); // tabelle noch schließen
	}

	Date mothersDay() {
		Date tempMothersDay = this;
		tempMothersDay.month = 5;
		boolean firstSo = true; // für ersten Sonntag im Monat
		for (tempMothersDay.day = 1; tempMothersDay.day < countMonth();
				tempMothersDay.day++) {
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

	Date easter() {
		int a = year % 19;
		int b = year / 100;
		int c = year % 100;
		int d = b / 4;
		int e = b % 4;
		int f = (int) ((b + 8) / 25);
		int g = (int) ((b - f + 1) / 3);
		int h = (19 * a + b - d - g + 15) % 30;
		int i = c / 4;
		int k = c % 4;
		int l = (32 + 2 * e + 2 * i - h - k) % 7;
		int m = (a + 11 * h + 22 * l) / 451;
		int n = (h + l - 7 * m + 114) / 31;
		int p = (h + l - 7 * m + 114) % 31;
		Date temp = new Date((int) p, (int) n, year);
		return temp.nextDay();
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

		Date d10 = new Date(20, 11, 2013);
		System.out
				.println("Count month " + d10.countMonth() + " day " + d10.day);
		System.out.println(d10.nextDay().toString());

		Date d11 = new Date(12, 11, 2013);
		System.out.println(d11.monthAsHTML());

		System.out.println();
		System.out.println(d10.mothersDay().toString());

		Date result = new Date(31, 12, 2018).easter();
		System.out.println("hi " + result.toString());
	}
}

//
//Date d1 = new Date(18, 11, 2019);
//System.out.println(d1.dayOfWeek()+ " | " + d1.dayOfWeek2());
//Date d2 = new Date(19, 11, 2019);
//System.out.println(d2.dayOfWeek()+ " | " + d2.dayOfWeek2());
//Date d3 = new Date(20, 11, 2019);
//System.out.println(d3.dayOfWeek()+ " | " + d3.dayOfWeek2());
//Date d4 = new Date(21, 11, 2019);
//System.out.println(d4.dayOfWeek()+ " | " + d4.dayOfWeek2());
//Date d5 = new Date(22, 11, 2018);
//System.out.println(d5.dayOfWeek()+ " | " + d5.dayOfWeek2());
//Date d6 = new Date(23, 11, 2019);
//System.out.println(d6.dayOfWeek()+ " | " + d6.dayOfWeek2());
//Date d7 = new Date(24, 11, 2019);
//System.out.println(d7.dayOfWeek()+ " | " + d7.dayOfWeek2());

//int dayOfWeek2() {
//	if (month < 3) {
//		year--;
//	}
//	int temp = (int) (((day + (2.6 * ((month + 9) % 12 + 1) - 0.2)
//			+ year % 100 + (year % 100 / 4) + (year / 400)
//			- 2 * (year / 100) - 1) % 7 + 7) % 7 + 1);
//	return (temp == 7) ? 0 : temp;
//}
//
//int dayOfWeekNormal() {
//	return (dayOfWeek() == 0) ? 7 : dayOfWeek();
//}