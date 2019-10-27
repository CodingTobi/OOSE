class Date {
	private int day;
	private int month;
	private int year;

	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public String toString() {
		return day + "." month + "." year;
	}

	public static void main(String[] args) {
		Date d1 = new Date(30, 11, 2018);
		System.out.println(d1.toString());
	}
}
