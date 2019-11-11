package Uebungsblatt3;

class DateTime {
	Date date;
	Time time;

	DateTime(Date d, Time t) {
		this.date = d;
		this.time = t;
	}

	public String toString() {
		return date.toString() + " " + time.toString();
	}

	public boolean isEarlierThan(DateTime that) {
		return (date.isEarlierThan(that.date)
				|| date.isSameDate(that.date) && time.isEarlierThan(that.time));
	}

	public boolean isLaterThan(DateTime that) {
		return (date.isLaterThan(that.date)
				|| date.isSameDate(that.date) && time.isLaterThan(that.time));
	}

	public static void main(String[] args) {
		Date d = new Date(29, 11, 2018);
		Time t = new Time(12, 59, 15);
		DateTime dt = new DateTime(d, t);
		System.out.println(dt.toString());
	}
}
