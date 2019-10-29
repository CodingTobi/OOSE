package Uebungsblatt2;

class DateTime {
	Date d;
	Time t;

	DateTime(Date d, Time t) {
		this.d = d;
		this.t = t;
	}

	public String toString() {
		return d.toString() + " " + t.toString();
	}

	public static void main(String[] args) {
		Date d = new Date(29, 11, 2018);
		Time t = new Time(12, 59, 15);
		DateTime dt = new DateTime(d, t);
		System.out.println(dt.toString());
	}
}
