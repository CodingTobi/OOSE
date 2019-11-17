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
			year = year - 1;
		}
		return (int) (((day + (2.6 * ((month + 9) % 12 + 1) - 0.2) + year % 100
				+ (year % 100 / 4) + (year / 400) - 2 * (year / 100) - 1) % 7
				+ 7) % 7 + 1);
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
	}
}