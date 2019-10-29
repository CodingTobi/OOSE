package Uebungsblatt2;

class Time {
	private int hour;
	private int minute;
	private int second;

	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public String toString() {
		return hour + ":" + minute + " Uhr";
	}

	public static void main(String[] args) {
		Time t1 = new Time(12, 59, 15);
		System.out.println(t1.toString());
	}
}
