package Uebungsblatt3;

class Date {
	int day;
	int month;
	int year;

	Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public boolean isEarlierThan(Date that) {
		return (that.year <= this.year && that.month <= this.month && that.day < this.day);
	}
	
	public boolean isLaterThan(Date that) {
		return (that.year >= this.year && that.month >= this.month && that.day > this.day);
	}
	
	public boolean isSameDate(Date that) {
		return (that.year == this.year && that.month == this.month && that.day == this.day);
	}
	
	public boolean isLeapYear(Date that) {
		if (that.year % 4 == 0 && that.year % 100 != 0 ) {
			return true;
		} else if (that.year % 100 == 0 && that.year % 400 != 0 ) {
			return false;
		}
		else if (that.year % 400 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public int getAbsoluteDaysInYear() {
		return (isLeapYear(this)) ? 366 : 365;
	}

	public String toString() {
		return day + "." + month + "." + year;
	}

	public static void main(String[] args) {
		Date d1 = new Date(30, 11, 2018);
		Date d2 = new Date(29,11,2018);
		System.out.println(d1.toString());
		
		
		System.out.println("false  " + d1.isEarlierThan(d2));
		System.out.println("true  " + d2.isEarlierThan(d1));
		
		System.out.println("true  " + d1.isLaterThan(d2));
		System.out.println("false  " + d1.isLaterThan(d2));
		
		System.out.println("false   "+d1.isSameDate(d2));
	}
}
